#include<limits.h>
int reverse(int x){
    int num=x;
    long long sum=0;
    int digit;
    while(num!=0)
    {
        digit=num%10;
        sum=sum*10+digit;
        num=num/10;
    }
    if(sum>INT_MAX || sum<INT_MIN)
    {
        return 0;
    }
    return sum;

}