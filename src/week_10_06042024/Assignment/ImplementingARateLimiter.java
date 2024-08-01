package week_10_06042024.Assignment;

public class ImplementingARateLimiter {
    /*
    Objective: Understand how to use encapsulation to control access frequencies.

    Steps:

    1. Create a class called RateLimiter.
    2. Define private member variables lastAccessed (type long to store a timestamp) and threshold (type int for how many milliseconds between accesses).
    3. Implement a method canAccess() that checks if the current access is within the threshold since the last access.
    4. Implement a method recordAccess() to update the lastAccessed timestamp.
    5. Ensure there's no direct way to modify lastAccessed from outside the class.
    6. In a main method, create a RateLimiter, try accessing it at different intervals, and observe the result.
     */
}
