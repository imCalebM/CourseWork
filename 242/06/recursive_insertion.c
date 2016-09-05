#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*defining size of array*/
#define ARRAY_MAX 30000

/*insertion sort function which is called upon in main*/
void insertion_sort(int *a, int n){
    /*variable declaration*/
    int i, j;
    int key;
    /*for and while loops to run through each i and move it appropriately*/
    for(i=1; i<n;i++){
        key = a[i];
        j=i-1;
        while(key<a[j] && j>=0){
            a[j+1]=a[j];
            --j;
        }
        a[j+1]=key;
    }/*exiting the for and while loop*/
}

/* n is the size of the array */
void print_array(int *a, int n) {
    if (n > 0) {
        printf("%d\n", a[0]);
        print_array(a + 1, n - 1);
    }
}

/*main function which declares variables and runs insertion sort*/
int main(void){
    int my_array[ARRAY_MAX];
   
    int count = 0;
    /*while loop to check for count and if there is more input*/
    while(count<ARRAY_MAX && 1 == scanf("%d", &my_array[count])){
        count++;
    }
    /*starting the clock and call the insertion sort method*/
   
    insertion_sort(my_array, count);
 
    
    print_array(my_array, count);


return EXIT_SUCCESS; /*exiting the loop*/
}