#include <stdio.h>
#include <stdlib.h>
#include "graph.h"

int main(void){
    graph g;
    int size, u, v;
    scanf("%d", &size);
    g = graph_new(size);
    while(2 == scanf("%d %d", &u, &v)){
        graph_add_directed(g, u, v);
    }
    graph_dfs(g);
    graph_print(g);
    graph_free(g);
    return EXIT_SUCCESS;
}