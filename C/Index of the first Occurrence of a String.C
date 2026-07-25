int strStr(char* haystack, char* needle) {

    int len = 0;
    int len1 = 0;

    while(haystack[len] != '\0')
        len++;

    while(needle[len1] != '\0')
        len1++;

    for(int i = 0; i <= len - len1; i++)
    {
        int j;

        for(j = 0; j < len1; j++)
        {
            if(haystack[i + j] != needle[j])
            {
                break;
            }
        }

        if(j == len1)
        {
            return i;
        }
    }

    return -1;
}
