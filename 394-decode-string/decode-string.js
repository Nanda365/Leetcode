/**
 * @param {string} s
 * @return {string}
 */
var decodeString = function(s) {
    let stack = []
    let currstr = ""
    let currnum = 0

    for(let ch of s){
        if(!isNaN(ch)){
            currnum = currnum*10+Number(ch)
        }else if(ch==="["){
            stack.push([currstr,currnum])
            currstr = ""
            currnum = 0
        }else if(ch==="]"){
            let[prevstr,num]=stack.pop()
            currstr = prevstr + currstr.repeat(num)
        }else{
            currstr += ch
        }
    }
    return currstr;
    
};