## Size of Hypergraph
We have a graph of 2 Nodes the methods Foo#Foo() and Foo#bar()
Foo() calls bar() and bar calls Foo()
This means our graph should be something like this:
bar<->Foo  
We have one hyperedge, between Foo and bar.
### System graph
We add a node without any connections.
The method is named env in the following.
Our graph should look like this:
env

bar<-> foo

## Pattern

bar and Foo are part of the only hyperedge; their pattern is `1`.
env is part of no hyperedge; its pattern is `0`.
      pattern prob
env | 0     | 1
bar | 1     | 2
Foo | 1     | 2

Prob is how often a pattern is occurring.
|Nodes| is the number of nodes.

log_2(prob/|Nodes|)
This means our size is
`- log_2(2/3) + - log_2(2/3) + -log_2(1/3)` = 2.75
In reiners code(he adds +1 to the size)
`- log_2(2/4) + - log_2(2/4) + -log_2(1/4)` = 4

