# Notes

### Collections 

- **ArrayList**
    - uses a dynamic array to store the duplicate elements of different data types
    - maintains the insertion order
    - non synchronized
    - elements can be randomly accessed 
    - ArrayList<String> list = new ArrayList<String>();

- **LinkedList**
    - can store duplicate elements 
    - maintains the insertion order
    - not synchronized
    - manipulation is fast because no shifting is required
    - LinkedList<String> list = new LinkedList<String>();

- **QUEUE Interface**
    - maintains first in first out order
    - ordered list
    - can be instantiated as 
        - Queue<String> q1 = new PriorityQueue();
        - Queue<String> q2 = new ArrayDeque();
    - __.peek()__ : returns the element present at the front of the container.
    - __.remove()__ : removes the head
    - __.poll()__ : retrieve or fetch and remove the first element of the queue or remove the element having the highest priority.
    - **PriorityQueue**
        - every element has a certain priority.
        - only supports comparable data.
        - doesn't allow null values to be stored in the queue
        - ordered list
        - __Note__
            - Smaller numbers have higher priority than bigger numbers so they'll be removed first.
    - **Deque Interface**
        - we can remove and add elements from both the side
        - Stands for double ended queue which enables us to perform the operations at both the ends.
        - can be instantiated as 
            - Deque d = new ArrayDeque();
        - ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.