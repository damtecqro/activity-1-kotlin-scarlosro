package com.test.kotlinactivity1


/*
fun <T> linea(a:List<T>):List<Pair<Int,T>>{

var result: List<Pair<Int,T>> = emptyList()
var index = 1
var count = 1;

mientras (index <= (a.size-1)){

    if(a[index-1] == a[index] )
    {
        count++;
    }
    else
    {
        result+= Pair(count,a[index-1])
        count=1;
    }

    index++;
}
    result +=  Pair(count,a[index-1]);
    return result;

}
 */

//funcion que regresa la lista
fun <T> linea(a:List<T>):List<Pair<Int,T>>{

var result: List<Pair<Int,T>> = emptyList()
var index = 1
var count = 1;
//mientras que index sea menor al string
while (index <= (a.size-1)){
    //que verifique mientras el antecesor sea igual al otro, si es asi suma
    if(a[index-1] == a[index] )
    {
        count++;
    }
    // si no es lo contrario entonces ya lo guarda en la lista
    else
    {
        result+= Pair(count,a[index-1])
        count=1;
    }

    index++;
}
    result +=  Pair(count,a[index-1]);
    return result;

}

    assert(linea("aaaabccaadeeee".toList()), listOf(
    Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e')))

    assert(linea("hhhooola".toList()), listOf(Pair(3,'h'),Pair(3,'o'),Pair(1,'l'),Pair(1,'a')))
    assert(linea("caaaaamiiiiioooon".toList()), listOf(Pair(1,'c'),Pair(5,'a'),Pair(1,'m'),Pair(5,'i'),Pair(4,'o'),Pair(1,'n')))