class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int li=0;
        int ri=arr.length-1;
        while(li<ri){
            char chl=arr[li];
            char chr=arr[ri];
            if(isvowel(chl)&&isvowel(chr)){
                arr[li]=chr;
                arr[ri]=chl;
                li++;
                ri--;
            }else if(isvowel(chl)){
                ri--;
            }else if(isvowel(chr)){
                li++;
            }else{
                li++;
                ri--;
            }
        }
        return new String(arr);
    }

    Boolean isvowel(char ch){
        if(ch=='a'|| ch=='A'){
            return true;
        }
        if(ch=='e'|| ch=='E'){
            return true;
        }
        if(ch=='i'|| ch=='I'){
            return true;
        }
        if(ch=='o'|| ch=='O'){
            return true;
        }
        if(ch=='u'|| ch=='U'){
            return true;
        }else{
            return false;
        }
    }
}