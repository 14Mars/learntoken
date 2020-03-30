package testapp1.leet.queue;

public class CircularQueue {


    class MyCircularQueue {
        int[] queue;
        int head;
        int tail;
        int totalLength;
        int currentSize;

        /**
         * Initialize your data structure here. Set the size of the queue to be k.
         */
        public MyCircularQueue(int k) {
            queue = new int[k];
            totalLength = k;
            currentSize = 0;
            head = 0;
            tail = head;


        }

        /**
         * Insert an element into the circular queue. Return true if the operation is successful.
         */
        public boolean enQueue(int value) {
            //是否队满
            if (isFull()) {
                return false;
            }

            if (isEmpty()) {
                queue[tail] = value;
//                head = tail;
                currentSize++;
                return true;
            }

            if (tail == totalLength - 1) {
                tail = 0;
            } else {
                tail = tail + 1;
            }
            queue[tail] = value;
            currentSize++;
            return true;
        }

        /**
         * Delete an element from the circular queue. Return true if the operation is successful.
         */
        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }

            if (currentSize == 1){
                queue[head] = -1;
                currentSize--;
                return true;
            }


            if (head == totalLength - 1) {
                head = 0;
            } else {
                head = head + 1;
            }
            currentSize--;
            return true;
        }

        /**
         * Get the front item from the queue.
         */
        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return queue[head];

        }

        /**
         * Get the last item from the queue.
         */
        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            return queue[tail];
        }

        /**
         * Checks whether the circular queue is empty or not.
         */
        public boolean isEmpty() {
            return currentSize == 0;
        }

        /**
         * Checks whether the circular queue is full or not.
         */
        public boolean isFull() {
            return currentSize == totalLength;
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */


}
