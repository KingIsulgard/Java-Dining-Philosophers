# Java-Dining-Philosophers
A Java solution for the Dining Philosophers computer problem using a Resource vector solution. 

## The Dining Philosophers problem (source wiki)
Five silent philosophers sit at a round table with bowls of spaghetti. Forks are placed between each pair of adjacent philosophers. (An alternative problem formulation uses rice and chopsticks instead of spaghetti and forks.)
Each philosopher must alternately think and eat. However, a philosopher can only eat spaghetti when he has both left and right forks. Each fork can be held by only one philosopher and so a philosopher can use the fork only if it is not being used by another philosopher. After he finishes eating, he needs to put down both forks so they become available to others. A philosopher can take the fork on his right or the one on his left as they become available, but cannot start eating before getting both of them.
Eating is not limited by the remaining amounts of spaghetti or stomach space; an infinite supply is assumed.
The problem is how to design a discipline of behavior (a concurrent algorithm) such that each philosopher will not starve; i.e., can forever continue to alternate between eating and thinking, assuming that any philosopher cannot know when others may want to eat or think.

## Problems (source wiki)
The problem was designed to illustrate the challenges of avoiding deadlock, a system state in which no progress is possible. To see that a proper solution to this problem is not obvious, consider a proposal in which each philosopher is instructed to behave as follows:
think until the left fork is available; when it is, pick it up;
think until the right fork is available; when it is, pick it up;
when both forks are held, eat for a fixed amount of time;
then, put the right fork down;
then, put the left fork down;
repeat from the beginning.
This attempted solution fails because it allows the system to reach a deadlock state, in which no progress is possible. This is the state in which each philosopher has picked up the fork to the left, and is waiting for the fork to the right to become available. With the given instructions, this state can be reached, and when it is reached, the philosophers will eternally wait for each other to release a fork.[4]
Resource starvation might also occur independently of deadlock if a particular philosopher is unable to acquire both forks because of a timing problem. For example there might be a rule that the philosophers put down a fork after waiting ten minutes for the other fork to become available and wait a further ten minutes before making their next attempt. This scheme eliminates the possibility of deadlock (the system can always advance to a different state) but still suffers from the problem of livelock. If all five philosophers appear in the dining room at exactly the same time and each picks up the left fork at the same time the philosophers will wait ten minutes until they all put their forks down and then wait a further ten minutes before they all pick them up again.
Mutual exclusion is the basic idea of the problem; the dining philosophers create a generic and abstract scenario useful for explaining issues of this type. The failures these philosophers may experience are analogous to the difficulties that arise in real computer programming when multiple programs need exclusive access to shared resources. These issues are studied in the branch of Concurrent Programming. The original problems of Dijkstra were related to external devices like tape drives. However, the difficulties exemplified by the dining philosophers problem arise far more often when multiple processes access sets of data that are being updated. Systems such as operating system kernels use thousands of locks and synchronizations that require strict adherence to methods and protocols if such problems as deadlock, starvation, or data corruption are to be avoided.

## Solution I programmed
There exists many solution to this philosophers dilemma but most of them require a lot of computing resources like the solution with a monitor.

The easiest solution is the one with a resource vector or resource hierarchy and just number the 5 forks and program each philosopher to always take the fork with the lowest number first. This way all philosophers will take the right fork first except one who will first grab to the left one. 

##Donate
You can support [contributors](https://github.com/KingIsulgard/Java-Dining-Philosophers/graphs/contributors) of this project individually. Every contributor is welcomed to add his/her line below with any content. Ordering shall be alphabetically by GitHub username.

Please consider a small donation. It would make me really happy.

* [@KingIsulgard](https://github.com/KingIsulgard): <a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=HQE64D8RQGPLC"><img src="https://www.paypalobjects.com/en_US/i/btn/btn_donate_LG.gif" alt="[paypal]" /></a> !

##License and Warranty
The license for the code is included with the project; it's basically a BSD license with attribution.

You're welcome to use it in commercial, closed-source, open source, free or any other kind of software, as long as you credit me appropriately.

The code comes with no warranty of any kind. I hope it'll be useful to you (it certainly is to me), but I make no guarantees regarding its functionality or otherwise.
