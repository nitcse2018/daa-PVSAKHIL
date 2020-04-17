//Progarm to perform merge sort on an array
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void merge(int arr[],int l,int m,int r)
{
    int i,j,k;
    int n1 = m-l+1;
    int n2 = r-m;
    int L[n1],R[n2];
    for(i=0;i<n1;i++)
        L[i]=arr[i+l];
    for(j=0;j<n2;j++)
        R[j]=arr[m+1+j];
    i=0;
    j=0;
    k=l;
    while (i<n1 && j<n2)
    {
        if(L[i]<=R[j])  arr[k++]=L[i++];
        else arr[k++]=R[j++];
    }
    while(i<n1)
        arr[k++]=L[i++];
    while(j<n2)
        arr[k++]=R[j++];
}
void merge_sort(int arr[],int l,int r)
{
    if(l<r)
    {
        int m=(l+r)/2;
        merge_sort(arr,l,m);
        merge_sort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}
void main()
{
    int n;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    int arr[n],i;
    //printf("Enter the array: ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    //clock_t tm=clock();
    merge_sort(arr,0,n-1);
    //tm=clock()-tm;
   // double time_merge = ((double)tm)/CLOCKS_PER_SEC;
    printf("Sorted Array is: ");
    for(i=0;i<n;i++)
        printf("%d ",arr[i]);
    //printf("\nTime taken by merge sort = %f\n",time_merge);
}