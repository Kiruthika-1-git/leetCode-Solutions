class Solution {
    public String reverseVowels(String s) {
        char temp;
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while(left<right)
        {
         if(arr[left] == 'A' || arr[left] == 'a' ||
               arr[left] == 'E' || arr[left] == 'e' ||
               arr[left] == 'I' || arr[left] == 'i' ||
               arr[left] == 'O' || arr[left] == 'o' ||
               arr[left] == 'U' || arr[left] == 'u')
            {
                if(arr[right] == 'A' || arr[right] == 'a' ||
                   arr[right] == 'E' || arr[right] == 'e' ||
                   arr[right] == 'I' || arr[right] == 'i' ||
                   arr[right] == 'O' || arr[right] == 'o' ||
                   arr[right] == 'U' || arr[right] == 'u')
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else
            {
                right--;
            }

            }
            else
            {
                left++;
               
            }
        }
        return new String(arr);
    }
}