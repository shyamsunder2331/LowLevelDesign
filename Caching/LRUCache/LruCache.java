/* 1. LRU Cache — 
  The expected answer is HashMap + Doubly Linked List for O(1) get 
  and put: the map gives O(1) lookup, the linked list maintains recency 
  order so you can move a node to the front and evict from the tail in O(1). 
  Interviewers care that you don't reach for an O(n) scan. (LeetCode 146.)
  */
