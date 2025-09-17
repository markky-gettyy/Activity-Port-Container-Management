# Activity-Port-Container-Management

## Port Container Management System

A simple Java console-based system that simulates how a shipping port manages containers and ships.
The system uses stack (LIFO) and queue (FIFO) data structures to handle real-world port operations:

- Containers are unloaded from trucks and temporarily stored at the port using a stack (last-in, first-out).

- Ships line up at the dock waiting to be loaded using a queue (first-in, first-out).

- When loading, the top container from the stack is loaded onto the front ship in the queue.
