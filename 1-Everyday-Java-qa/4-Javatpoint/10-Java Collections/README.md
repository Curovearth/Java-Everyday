# Notes

### Collections 

- ArrayList
    - uses a dynamic array to store the duplicate elements of different data types
    - maintains the insertion order
    - non synchronized
    - elements can be randomly accessed 
    - ArrayList<String> list = new ArrayList<String>();
- LinkedList
    - can store duplicate elements 
    - maintains the insertion order
    - not synchronized
    - manipulation is fast because no shifting is required
    - LinkedList<String> list = new LinkedList<String>();
- QUEUE Interface
    - maintains first in first out order
    - ordered list
    - can be instantiated as 
        - Queue<String> q1 = new PriorityQueue();
        - Queue<String> q2 = new ArrayDeque();