class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list =new ArrayList<>();

        recursion(list,0,0,"",n);
        return list;
    }

    void recursion(List<String> list, int open, int close, String s, int n)
    {
        if(open==n && close==n)//s.length()==n*2
        {
            list.add(s);
            return;
        }

        if(open<n)
        {
            recursion(list,open+1,close,s+"(",n);
        }

        if(open>close)
        {
            recursion(list,open,close+1,s+")",n);
        }
    }
}