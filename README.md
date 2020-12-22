# Stacks-Queues
Problems from Stacks&amp;Queues of Cracking the Coding

3.2 Stack Min: Design a stack which has a function which returns the minimum element in O(1) time
Solution: When we add a new value to the value stack, if this becomes our minimum, we add it to the top of state stack. If this value is popped from the the value stack then we can check the top of the state stack and pop if necessary. The state stack keeps track of the mins at certain states whenever new values are popped or added onto the stack.
