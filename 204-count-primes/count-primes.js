var countPrimes = function(n) {

    let prime = new Array(n).fill(true);

    prime[0] = false;
    prime[1] = false;

    for(let i = 2; i * i < n; i++){

        if(prime[i]){

            for(let j = i * i; j < n; j += i){
                prime[j] = false;
            }
        }
    }

    let count = 0;

    for(let i = 2; i < n; i++){

        if(prime[i]){
            count++;
        }
    }

    return count;
};