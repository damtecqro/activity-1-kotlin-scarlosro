package com.example.myapplication

fun primo(numero: Int) : Int{
    var x = 2;
    while(x < numero){
        if(numero%x == 0)
            return x;
        x++;
    }
    return 0
}


fun goldbachlist(rango: IntRange): List<Pair<Int,Int>>{
    var lista : List<Pair<Int,Int>> = emptyList();
    var primero = rango.first;
    var ultimo = rango.last;

    while(primero <= ultimo)
    {
        if(primero % 2 == 0){
            var aux2 = 2;
            var aux = primero/2;
            var aux3:Int
            while(aux2 < aux){
                if(primo(aux2) == 0){
                    if(primo(primero-aux2) == 0){
                        aux3=primero-aux2
                        lista += Pair(aux2,aux3)
                        break;
                    }

                }
                aux2++;
            }
        }
        primero++;
    }
    return lista;
}

fun goldbachlistLimited(rango: IntRange,minimo: Int): List<Pair<Int,Int>>{
    var lista : List<Pair<Int,Int>> = emptyList();
    var primero = rango.first;
    var ultimo = rango.last;

    while(primero <= ultimo)
    {
        if(primero % 2 == 0){
            var aux2 = 2;
            var aux = primero/2;
            var aux3: Int
            while(aux2 < aux){
                if(primo(aux2) == 0){
                    if(primo(primero-aux2) == 0){
                        if(aux2 > minimo) {
                            aux3=primero-aux2
                            lista += Pair(aux2, aux3)
                            break;
                        }
                        else{
                            break;
                        }
                    }

                }
                aux2++;
            }
        }
        primero++;
    }
    return lista;
}

assert(goldbachlist(9..20), listOf( Pair(3, 7),
    Pair(5, 7),
    Pair(3, 11),
    Pair(3, 13),
    Pair(5, 13),
    Pair(3, 17)))

assert(goldbachlist(20..40), listOf(
    Pair(3, 17),
    Pair(3, 19),
    Pair(5, 19),
    Pair(3, 23),
    Pair(5, 23),
    Pair(7, 23),
    Pair(3, 29),
    Pair(3, 31),
    Pair(5, 31),
    Pair(7, 31),
    Pair(3, 37)))



assert(goldbachlistLimited(2..3000,50), listOf(
    Pair(73, 919),
    Pair(61, 1321),
    Pair(67, 1789),
    Pair(61, 1867),
    Pair(61, 2017),
    Pair(61, 2377),
    Pair(53, 2459),
    Pair(53, 2477),
    Pair(61, 2557),
    Pair(103, 2539)))

assert(goldbachlistLimited(2900..3000,20), listOf(
    Pair(31, 2887),
    Pair(31, 2917),
    Pair(37, 2917),
    Pair(23, 2969),
    Pair(23, 2971),
    Pair(43, 2953),
    Pair(29, 2969),
    Pair(29, 2971)))
