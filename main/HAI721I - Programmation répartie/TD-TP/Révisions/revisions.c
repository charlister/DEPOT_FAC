#include <stdio.h>
#include <stdlib.h>

int* extract(int t[], int n, int a, int b) 
{
    int new_n = 0;
    for (size_t i = 0; i < n; i++)
        if(a<=t[i] && t[i]<=b)
            new_n++;
    
    int* new_t = malloc(new_n * sizeof(int));
    if(!new_t)
        return NULL;
    
    int current_index_of_new_t = 0;
    for (size_t i = 0; i < new_n; i++)
        if(a<=t[i] && t[i]<=b)
        {
            new_t[current_index_of_new_t] = t[i];
            current_index_of_new_t++;
        }
    return new_t;
}

int main(int argc, char const *argv[])
{
    int a = 10;
    int b = 25;
    int *p = &b;
    int *pp = &a;
    int tmp = 0;

    printf("a = %d\nb = %d\np = %p\npp = %p\n", a, b, p, pp);

    tmp = *(&(*(*(&p))));
    printf("--------------------------------------\ntmp_1 = %d\n", tmp);

    tmp = *(p-1);
    printf("--------------------------------------\ntmp_2 = %d\n", tmp);

    tmp = *(*(&p)-1);
    printf("--------------------------------------\ntmp_3 = %d\n", tmp);

    tmp = *(*(&pp)+1);
    printf("--------------------------------------\ntmp_4 = %d\n", tmp);

    tmp = *(&(*(*(&p)))-1);
    printf("--------------------------------------\ntmp_5 = %d\n", tmp);


    int t[5] = {1, 3, 5, 7, 9}, x=2, y=5;
    int* res = extract(t, 5, x, y);
    for (size_t i = 0; i < 2; i++)
    {
        printf("%d ", res[i]);
    }
    
    free(res);

    return 0;
}
