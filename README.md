# Activity-Port-Container-Management

## Port Container Management System

A simple Java console-based system that simulates how a shipping port manages containers and ships.
The system uses stack (LIFO) and queue (FIFO) data structures to handle real-world port operations:

- Containers are unloaded from trucks and temporarily stored at the port using a stack (last-in, first-out).

- Ships line up at the dock waiting to be loaded using a queue (first-in, first-out).

- When loading, the top container from the stack is loaded onto the front ship in the queue.


****
Features

- ✅ Store containers with ID, description, and weight
- ✅ View all containers from top to bottom
- ✅ Register arriving ships with name and captain
- ✅ View all waiting ships from front to rear
- ✅ Load containers onto ships (pop + poll)
- ✅ Display remaining containers and ships after loading

****

## Menu Operations

=== Port Container Management System ===

[1] Store container (push)

[2] View port containers

[3] Register arriving ship (enqueue)

[4] View waiting ships

[5] Load next ship (pop container + poll ship)

[0] Exit

****

## Sample Run

=== Port Container Management System ===

[1] Store container (push)

[2] View port containers

[3] Register arriving ship (enqueue)

[4] View waiting ships

[5] Load next ship (pop container + poll ship)

[0] Exit


Enter choice: 1

Enter container ID: CT001

Enter description: Electronics

Enter weight (e.g., 500kg): 500kg

Stored: CT001 | Electronics | 500kg


Enter choice: 3

Enter ship name: MV OceanStar

Enter captain name: Reyes

Registered: MV OceanStar | Capt. Reyes


Enter choice: 5

Loaded: CT001 | Electronics | 500kg → MV OceanStar | Capt. Reyes

Remaining containers: 0

Remaining ships waiting: 0











