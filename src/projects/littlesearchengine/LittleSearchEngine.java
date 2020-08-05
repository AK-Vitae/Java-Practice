package projects.littlesearchengine;

import java.io.*;
import java.util.*;

/**
 * This class encapsulates an occurrence of a keyword in a document. It stores the
 * document name, and the frequency of occurrence in that document. Occurrences are
 * associated with keywords in an index hash table.
 *
 * @author Sesh Venugopal
 */
class Occurrence {
    /**
     * Document in which a keyword occurs.
     */
    String document;

    /**
     * The frequency (number of times) the keyword occurs in the above document.
     */
    int frequency;

    /**
     * Initializes this occurrence with the given document,frequency pair.
     *
     * @param doc  Document name
     * @param freq Frequency
     */
    public Occurrence(String doc, int freq) {
        document = doc;
        frequency = freq;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "(" + document + "," + frequency + ")";
    }
}

/**
 * This class builds an index of keywords. Each keyword maps to a set of documents in
 * which it occurs, with frequency of occurrence in each document. Once the index is built,
 * the documents can searched on for keywords.
 */
public class LittleSearchEngine {

    /**
     * This is a hash table of all keywords. The key is the actual keyword, and the associated value is
     * an array list of all occurrences of the keyword in documents. The array list is maintained in descending
     * order of occurrence frequencies.
     */
    HashMap<String, ArrayList<Occurrence>> keywordsIndex;

    /**
     * The hash table of all noise words - mapping is from word to itself.
     */
    HashMap<String, String> noiseWords;

    /**
     * Creates the keyWordsIndex and noiseWords hash tables.
     */
    public LittleSearchEngine() {
        keywordsIndex = new HashMap<String, ArrayList<Occurrence>>(1000, 2.0f);
        noiseWords = new HashMap<String, String>(100, 2.0f);
    }

    /**
     * This method indexes all keywords found in all the input documents. When this
     * method is done, the keywordsIndex hash table will be filled with all keywords,
     * each of which is associated with an array list of Occurrence objects, arranged
     * in decreasing frequencies of occurrence.
     *
     * @param docsFile       Name of file that has a list of all the document file names, one name per line
     * @param noiseWordsFile Name of file that has a list of noise words, one noise word per line
     * @throws FileNotFoundException If there is a problem locating any of the input files on disk
     */
    public void makeIndex(String docsFile, String noiseWordsFile)
            throws FileNotFoundException {
        // load noise words to hash table
        Scanner sc = new Scanner(new File(noiseWordsFile));
        while (sc.hasNext()) {
            String word = sc.next();
            noiseWords.put(word, word);
        }

        // index all keywords
        sc = new Scanner(new File(docsFile));
        while (sc.hasNext()) {
            String docFile = sc.next();
            HashMap<String, Occurrence> kws = loadKeyWords(docFile);
            mergeKeyWords(kws);
        }

    }

    /**
     * Scans a document, and loads all keywords found into a hash table of keyword occurrences
     * in the document. Uses the getKeyWord method to separate keywords from other words.
     *
     * @param docFile Name of the document file to be scanned and loaded
     * @return Hash table of keywords in the given document, each associated with an Occurrence object
     * @throws FileNotFoundException If the document file is not found on disk
     */
    public HashMap<String, Occurrence> loadKeyWords(String docFile)
            throws FileNotFoundException {
        // Check for empty file contents
        if (docFile == null) {
            throw new FileNotFoundException("File Not Found!");
        }
        // Create new HashMap and read in file via scanner
        HashMap<String, Occurrence> keyWords = new HashMap<>();
        Scanner sc = new Scanner(new File(docFile));
        while (sc.hasNext()) {
            String keyWord = getKeyWord(sc.next());
            if (keyWord != null) {
                if (keyWords.containsKey(keyWord)) {
                    // If Hash Map already contains the keyWord then just increase its frequency
                    keyWords.get(keyWord).frequency++;
                } else {
                    // If Hash Map doesn't contain the keyWord then create a new Occurrence
                    Occurrence occurrence = new Occurrence(docFile, 1);
                    keyWords.put(keyWord, occurrence);
                }
            }
        }
        return keyWords;
    }

    /**
     * Merges the keywords for a single document into the master keywordsIndex
     * hash table. For each keyword, its Occurrence in the current document
     * must be inserted in the correct place (according to descending order of
     * frequency) in the same keyword's Occurrence list in the master hash table.
     * This is done by calling the insertLastOccurrence method.
     *
     * @param kws Keywords hash table for a document
     */
    public void mergeKeyWords(HashMap<String, Occurrence> kws) {
        //Change this up
//        for (String key : kws.keySet()) {
//            ArrayList<Occurrence> oc = new ArrayList<Occurrence>();
//
//            if (keywordsIndex.containsKey(key)) {
//                oc = keywordsIndex.get(key);//if the occurrence already exist in the main key word
//            }
//            oc.add(kws.get(key));
//            insertLastOccurrence(oc);
//            keywordsIndex.put(key, oc);
//        }
    }

    /**
     * Given a word, returns it as a keyword if it passes the keyword test,
     * otherwise returns null. A keyword is any word that, after being stripped of any
     * TRAILING punctuation, consists only of alphabetic letters, and is not
     * a noise word. All words are treated in a case-INsensitive manner.
     * <p>
     * Punctuation characters are the following: '.', ',', '?', ':', ';' and '!'
     *
     * @param word Candidate word
     * @return Keyword (word without trailing punctuation, LOWER CASE)
     */
    public String getKeyWord(String word) {
        String strippedWord = word.replaceAll("[^a-zA-Z]+$", "").toLowerCase();
        if (noiseWords.containsKey(strippedWord) || !strippedWord.matches("[a-zA-Z]+")) {
            return null;
        }
        return strippedWord;
    }

    /**
     * Inserts the last occurrence in the parameter list in the correct position in the
     * same list, based on ordering occurrences on descending frequencies. The elements
     * 0..n-2 in the list are already in the correct order. Insertion of the last element
     * (the one at index n-1) is done by first finding the correct spot using binary search,
     * then inserting at that spot.
     *
     * @param occs List of Occurrences
     * @return Sequence of mid point indexes in the input list checked by the binary search process,
     * null if the size of the input list is 1. This returned array list is only used to test
     * your code - it is not used elsewhere in the program.
     */
    public ArrayList<Integer> insertLastOccurrence(ArrayList<Occurrence> occs) {
        if (occs.size() <= 1) {
            return null;
        }
        ArrayList<Integer> midpointIndices = new ArrayList<>();
        Occurrence lastOccurrence = occs.get(occs.size() - 1);
        int lowerBound = 0;
        int upperBound = occs.size() - 2; // Last item (size-1) is excluded
        int midPoint = 0;
        while (lowerBound <= upperBound) {
            midPoint = (lowerBound + upperBound) / 2;
            midpointIndices.add(midPoint);
            // Reverse comparison conventions as frequencies are in DESCENDING order
            if (occs.get(midPoint).frequency > lastOccurrence.frequency) {
                lowerBound = midPoint+1;
            } else if (occs.get(midPoint).frequency < lastOccurrence.frequency) {
                upperBound = midPoint-1;
            } else if (occs.get(midPoint).frequency == lastOccurrence.frequency) {
                break;
            }
        }
        occs.add(midPoint+1,occs.remove(occs.size()-1));
        return midpointIndices;
    }

    /**
     * Search result for "kw1 or kw2". A document is in the result set if kw1 or kw2 occurs in that
     * document. Result set is arranged in descending order of occurrence frequencies. (Note that a
     * matching document will only appear once in the result.) Ties in frequency values are broken
     * in favor of the first keyword. (That is, if kw1 is in doc1 with frequency f1, and kw2 is in doc2
     * also with the same frequency f1, then doc1 will appear before doc2 in the result.
     * The result set is limited to 5 entries. If there are no matching documents, the result is null.
     *
     * @param kw1 First keyword
     * @param kw2 Second keyword
     * @return List of NAMES of documents in which either kw1 or kw2 occurs, arranged in descending order of
     * frequencies. The result size is limited to 5 documents. If there are no matching documents,
     * the result is null.
     */
    public ArrayList<String> top5search(String kw1, String kw2) {
//        ArrayList<String> topFive = new ArrayList<>();
//        // Make keywords into valid search terms
//        kw1 = kw1.trim().toLowerCase();
//        kw2 = kw2.trim().toLowerCase();
//        ArrayList<Occurrence> list1 = keywordsIndex.get(kw1);
//        ArrayList<Occurrence> list2 = keywordsIndex.get(kw2);
//        if(!keywordsIndex.containsKey(kw1) && !keywordsIndex.containsKey(kw2)){//both strings are not found
//            System.out.println("Both strings are not found");
//            return null;
//        }
//        else if(keywordsIndex.containsKey(kw1) && !keywordsIndex.containsKey(kw2)){//contains kw1 but not kw2
//            for(int i = 0; i < list1.size(); i++){
//                Occurrence occurrence = list1.get(i);
//                if(topFive.size() < 5){
//                    topFive.add(occurrence.document);
//                }
//            }
//            System.out.println("contains kw1 but not kw2");
//            System.out.println("Results:" + topFive);
//            return topFive;
//        }
//        else if(keywordsIndex.containsKey(kw2) && !keywordsIndex.containsKey(kw1)){//contains kw1 but not kw2
//            for(int i = 0; i < list2.size(); i++){
//                Occurrence occurrence = list2.get(i);
//                if(topFive.size() < 5){
//                    topFive.add(occurrence.document);
//                }
//            }
//            System.out.println("contains kw2 but not kw1");
//            System.out.println("Results:" + topFive);
//            return topFive;
//        }
//        else{//both are keywords
//            System.out.println("both are keywords");
//            ArrayList<Occurrence> occs = new ArrayList<Occurrence>();
//            occs.addAll(keywordsIndex.get(kw1));
//            occs.addAll(keywordsIndex.get(kw2));
//            for(int count = 0; count < 5 && !occs.isEmpty(); count++){
//                int ptr = 0;
//                int prev = -1;
//                for(ptr = 0; ptr < occs.size() && occs.get(ptr) != null; ptr++){
//                    if (prev == -1){
//                        if (!topFive.contains(occs.get(ptr).document)) prev = ptr;
//                    } else if (occs.get(ptr).frequency > occs.get(prev).frequency){
//                        if(!topFive.contains(occs.get(ptr).document)) prev = ptr;
//                    } else if (occs.get(ptr).frequency == occs.get(prev).frequency){
//                        if(keywordsIndex.get(kw1).contains(occs.get(ptr))){
//                            if(!topFive.contains(occs.get(ptr).document)) prev = ptr;
//                        }
//                    }
//                }
//                if (prev != -1) topFive.add(occs.remove(prev).document);
//            }
//            System.out.println("Result: " + topFive);
//            return topFive;
//        }
        return null;
    }

    public static void main(String[] args) {
        String myString = "equi-distant";
        System.out.println(myString);
        String strippedWord = myString.replaceAll("[^a-zA-Z]+$", "").toLowerCase();
        System.out.println(strippedWord);
        if (!strippedWord.matches("[a-zA-Z]+")) {
            System.out.println(strippedWord + " has punctuation");
        } else {
            System.out.println(strippedWord);
        }
    }
}
