bool isPalindrome(int x) {
    int num=x;
    long long sum=0;
    int num1=num;
    if(x<0)
    {
        return false;
    }
    while(num!=0)
    {
        int digit=num%10;
        sum=sum*10+digit;
        num=num/10;

    }
    printf("%d",sum);
    if(num1==sum)
    {
        return 1;
    }
    else
    {
        return 0;
    }
    return NULL;
}
