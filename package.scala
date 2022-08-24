package object Recursion {
  /**
   * Ejercicio 1 (Triangulo de pascal)
   */
  def pascal (c: Int, r: Int): Int={
    /* c = columnas y r= filas
    c & r > 0 y la longitud de c < r*/
    if (c < 0 || r < 0 || c > r)throw new IllegalArgumentException("No es posible, debe ser c<r")else{
      if (c == 0 || c == r) 1 else {
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  }
  /**
   * Ejercicio 2 (Balanceo de parentesis)
   */
  def balanceoParentesis (chars: List[Char]): Boolean ={
    def parentesis (lista: List[Char], cont: Int): Int={
      if (lista.isEmpty && cont >= 0) cont else{
        if (cont<0)cont else{
          if (lista.head == ')') parentesis(lista.tail , cont - 1)else{
            if (lista.head == '(') parentesis(lista.tail , cont + 1)else{
              parentesis(lista.tail, cont)
            }
          }
        }
      }
    }
   parentesis(chars,0)==0
  }
  /**
   * Ejercicio 3 (Cambio de monedas)
   */
  def cambioMonedas(total: Int, denom: List[Int]): Int = {
    if(total == 0)
      1
    else if(total > 0 && !denom.isEmpty)
      cambioMonedas(total - denom.head, denom) + cambioMonedas(total, denom.tail)
    else
      0
  }
}

