import Recursion.{pascal,balanceoParentesis,cambioMonedas}
// Pruebas pascal

pascal( 1 , 2 )
pascal( 3 , 4 )
pascal( 0 , 2 )
pascal( 1 , 2 )
pascal( 1 , 3 )

def filaTriangulo( fila : Int) =
  for (col<-0 to fila) yield pascal(col,fila)

def triang( filas : Int) =
  for (fila<-0 to filas) yield filaTriangulo(filas)

triang(0)
triang(1)
triang(2)
triang(3)
triang(4)
triang(5)

// Pruebas balanceo

balanceoParentesis("if_(zero?_x)_max_(/_1_x))".toList)
balanceoParentesis("())(".toList)
balanceoParentesis(":-)".toList)
balanceoParentesis("me_gusta(mucho(programar()".toList)
balanceoParentesis("ya_le_dije_(que_no_esta_hecho_(aun))".toList)

// Pruebas cambio de monedas
cambioMonedas ( 300, List ( 5 , 10 , 20 , 50 , 100 , 200 , 500 ))
cambioMonedas ( 1000, List ( 5 , 10 , 20 ))
cambioMonedas ( 100, List ( 5 , 10 , 20 , 50 , 100 ))
cambioMonedas ( 5, List (1,2,3,4,5))
cambioMonedas ( 1500, List ( 5 , 10 , 20 , 50 , 100 , 200 , 500 ))