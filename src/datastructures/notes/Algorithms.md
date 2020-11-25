# Algorithms

## Depth-First Search (DFS)

```
visit v and mark v as visited
for each neighbor w of v do
	if (w is not visited) then
		DFS(w)
	endif
endfor
```

## Breadth-First Search (BFS)

```
visit v and mark v as visited
add v to the queue
while the queue is not empty do
	w <- vertex at the front of the queue
	delete w from the queue
	for each neighbor p of w do
		if (p is not visited) then
			visit p and mark p as visited
			add p to the queue
		endif
	endfor
endwhile
```

## DFS Topological Sort

```
topnum <-n
	for each vertex v in the graph do
		if (v is not visited) then
		DFStopsort( v, topnum )
	endif
endfor

DFStopsort(v, topnum)
visit and mark v as visited
for each neighbor w of v do
	if (w is not visted) then
		DFStopsort(w, topnum)
	endif
endfor
number v with topnum
topnum <- topnum - 1

```

## Merge Sort

```java
    public void mergeSort(int[] array, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public void merge(int[] array, int low, int mid, int high) {
        // Creating temporary subarrays
        int[] leftArray = new int[mid - low + 1];
        int[] rightArray = new int[high - mid];

        // Copying our subarrays into temporaries
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        // Iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
```

## Quick Sort

```java
    //selects last element as pivot.
    public int partition(int[] intArray, int low, int high) {
        int pivot = intArray[high];
        int i = (low - 1); // smaller element index
        for (int j = low; j < high; j++) {
            // check if current element is less than or equal to pivot
            if (intArray[j] <= pivot) {
                i++;
                // swap intArray[i] and intArray[j]
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }
        // swap intArray[i+1] and intArray[high] (or pivot)
        int temp = intArray[i + 1];
        intArray[i + 1] = intArray[high];
        intArray[high] = temp;
        return i + 1;
    }
    
    //routine to sort the array partitions recursively
    public void quickSort(int[] intArray, int low, int high) {
        if (low < high) {
            //partition the array around pivot=>partitioning index and return pivot
            int pivot = partition(intArray, low, high);
            // sort each partition recursively
            quickSort(intArray, low, pivot - 1);
            quickSort(intArray, pivot + 1, high);
        }
    }
```

