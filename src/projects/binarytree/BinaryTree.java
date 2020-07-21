package projects.binarytree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BinaryTree {

    public static Queue<BTNode<dataNode>> makeQueue(double[] a) {
        /*
        // Requirements
        // Each element of the given array a must be inserted into a BTNode,
        // this method returns a queue of BTNodes, each node will contain a dataNode
        // the dataNode will have the value equal to the element of the array
        // count equal to the number of times that the element repeats
        // min and max must be equal to value.
        // the BTNode created must have its parent, right, and left references set to null
        */
        Queue<BTNode<dataNode>> nodeQueue = new Queue<BTNode<dataNode>>();
        // Use HashMap to handle duplicates
        Map<Double, Integer> valueAndCount = new HashMap<>();
        for (Double value : a) {
            Integer count = valueAndCount.get(value);
            if (count == null) {
                valueAndCount.put(value, 1);
            } else {
                valueAndCount.put(value, ++count);
            }
        }
        // Sort HashMap using TreeMap
        TreeMap<Double, Integer> sorted = new TreeMap<>(valueAndCount);

        // Make the queue
        for (Map.Entry<Double, Integer> entry : sorted.entrySet()) {
            dataNode newData = new dataNode();
            newData.value = entry.getKey();
            newData.max = entry.getKey();
            newData.min = entry.getKey();
            newData.count = entry.getValue();
            nodeQueue.enqueue(new BTNode<>(newData, null, null, null));
        }
        return nodeQueue;
    }

    public static Queue<BTNode<dataNode>> join(Queue<BTNode<dataNode>> myQueue) {
        /*
        // Requirements
        // For every two elements dequeued from myQueue create a new root element and
        // make the two dequeued elements be the left and right child of that root.
        // Each new root must contain the min value, obtained from the left subtree,
        // the max value, obtained from the right subtree, and the value should be
        // equal to the average of the maximum value of the left subtree and the
        // minimum value of the right subtree, count should be set equal to 0 (internal node)
        // Enqueue each new root node into another queue and return that queue.
        // In case that only one element is left in myQueue, just enqueue it
        // in the queue that will be returned.
        */
        Queue<BTNode<dataNode>> rootQueue = new Queue<BTNode<dataNode>>();
        while (myQueue.size() >= 1) {
            if (myQueue.size() == 1) {
                rootQueue.enqueue(myQueue.dequeue());
            } else {
                BTNode<dataNode> left = myQueue.dequeue();
                BTNode<dataNode> right = myQueue.dequeue();
                dataNode rootData = new dataNode();
                rootData.value = round((left.getData().max + right.getData().min) / 2);
                rootData.max = right.getData().max;
                rootData.min = left.getData().min;
                BTNode<dataNode> rootNode = new BTNode<>(rootData, left, right, null);
                rootQueue.enqueue(rootNode);
            }
        }
        return rootQueue;
    }

    public static int search(BTNode<dataNode> root, double target) {
        /*
        // Requirements
        // given a target value recursively search on the left or the right subtrees
        // by comparing the value in root to the target. You know that you got to a
        // leaf when the value count of the root is not equal to 0.
        */
        // Code is structured to differentiate from returning a internal node and if the target is not in the tree
        if (root.getData().value == target) {
            // Internal Node
            if (root.getData().count == 0) {
                //System.out.print("Internal Node of Tree: ");
                return root.getData().count;
            }
            //System.out.print("Tree Leaf with count of ");
            // Leaf Node
            return root.getData().count;

        }
        if (root.getData().value < target && root.getRight() != null) {
            return search(root.getRight(), target);
        } else if (root.getData().value > target && root.getLeft() != null) {
            return search(root.getLeft(), target);
        }
        //System.out.print("Target not found in Tree: ");
        // Target not found
        return 0;
    }

    // Helper method that will round to 4 decimal places
    private static double round(double value) {
        return (double) Math.round(value * 10000) / 10000;
    }

    public static void main(String[] args) {
//      Expected output:
//		(13.0,1) (12.5,1) (12.3,1) (12.1,1) (11.9,1) (10.3,2) (10.0,1) (9.2,1) (9.1,1) (8.0,1) (7.2,3) (5.8,2) (2.3,1) (1.0,1)
//		(10.15,0)  7.2   0
//		(7.6,0)  7.2   0
//		(4.05,0)  7.2   0
//		(6.5,0)  7.2   0
//		(7.2,3)  7.2   3
//		3
        double[] a = {1, 2.3, 5.8, 5.8, 7.2, 7.2, 7.2, 8, 9.1, 9.2, 10, 10.3, 10.3, 11.9, 12.1, 12.3, 12.5, 13};
        Queue<BTNode<dataNode>> myQueue = makeQueue(a);
        myQueue.traverse();
        System.out.println();
        while (myQueue.size() > 1) {
            myQueue = join(myQueue);
            myQueue.traverse();
            System.out.println();
        }
        BTNode<dataNode> root = myQueue.dequeue();
        System.out.println(search(root, 7.2));
        System.out.println(search(root, 7));
        System.out.println(search(root, 7.6));
    }
}
