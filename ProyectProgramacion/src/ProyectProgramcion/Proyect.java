package ProyectProgramcion;

import java.util.Scanner;

public class Proyect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean programa = true;
		
		String[] NombreProducto = new String[7];
		int[] PrecioProducto = new int[7];
        int[] CantidadProducto = new int[7];
        
        int PrecioNuevo = 0;
        int CantidadNueva = 0;
		
		int opcion = 0;
		int EliminarProducto = 0;
		int EditarProducto = 0;
		int indice = 0;
				
		do {
			System.out.println("Elija una opcion:");
			System.out.println("1. Añadir una Producto");
			System.out.println("2. Eliminar un Producto");
			System.out.println("3. Cambiar el precio de un Producto");
			System.out.println("4. Cambiar la cantidad de un Producto");
			System.out.println("5. Mostrar Producto");
			System.out.println("6. Mostar las cantidades de un Producto");
			System.out.println("7. Mostar el valor del inventario");
			System.out.println("8. Salir del programa");
			opcion = scanner.nextInt();

			if(opcion < 8) {
				
				switch (opcion) {
					
					case 1: 
						System.out.println("Ingrese el nombre del producto:");
						scanner.nextLine();
                        String NombreProductoNuevo = scanner.nextLine();
                        
                        
                        System.out.println("Ingrese el precio del producto:");
                        int PrecioProductoNuevo = scanner.nextInt();
                        
                        System.out.println("Ingrese la cantidad del producto:");
                        int CantidadProductoNuevo = scanner.nextInt(); 
						
						
						for(int i = 0; i < 7; i++) {
							if(NombreProducto[i] == null) {
								NombreProducto[i] = NombreProductoNuevo;
								PrecioProducto[i] = PrecioProductoNuevo;
								CantidadProducto[i] = CantidadProductoNuevo;
								break;
							}
						}
												
						System.out.println("\nProductos añadidos:");
					    for (int i = 0; i < NombreProducto.length; i++) {
					        if (NombreProducto[i] != null) {
					            System.out.println("Nombre: " + NombreProducto[i]);
					            System.out.println("Precio: " + PrecioProducto[i]);
					            System.out.println("Cantidad: " + CantidadProducto[i]);
					            System.out.println("--------------------");
					        }
					    
					    }
						
						break;
						
					case 2:
						
						indice = 0;
					    for (int i = 0; i < NombreProducto.length; i++) {
					    	indice+=1;
					        System.out.println(indice + "Nombre: " + NombreProducto[i]);
					        System.out.println("Precio: " + PrecioProducto[i]);
					        System.out.println("Cantidad: " + CantidadProducto[i]);
					        System.out.println("--------------------");					       
					    }
				
					    
					    System.out.println("Ingrese el valor del producto que desea eliminar");
					    EliminarProducto = scanner.nextInt();
					    
					    if(EliminarProducto < 7) {
					    	NombreProducto[EliminarProducto] = null;
					    	PrecioProducto[EliminarProducto] = 0;
					    	CantidadProducto[EliminarProducto] = 0;
					    }else {
					    	System.out.println("Indice invalido");
					    }
						
					    
					    for (int i = 0; i < NombreProducto.length; i++) {
					    	indice+=1;
					        System.out.println(indice + "Nombre: " + NombreProducto[i]);
					        System.out.println("Precio: " + PrecioProducto[i]);
					        System.out.println("Cantidad: " + CantidadProducto[i]);
					        System.out.println("--------------------");					       
					    }
						break;
						
					case 3:
						
						indice = 0;
					    for (int i = 0; i < NombreProducto.length; i++) {
					    	indice+=1;
					        System.out.println(indice + "Nombre: " + NombreProducto[i]);
					        System.out.println("Precio: " + PrecioProducto[i]);
					        System.out.println("Cantidad: " + CantidadProducto[i]);
					        System.out.println("--------------------");					       
					    }
				
					    
					    System.out.println("Ingrese el valor del producto que desea Editar");
					    EditarProducto = scanner.nextInt();
					    scanner.nextLine();
					    
					    System.out.println("Ingrese el nuevo Precio del Producto");
				    	PrecioNuevo = scanner.nextInt();
				    	
				    	PrecioProducto[EditarProducto] = PrecioNuevo;
					    
					    break;
					    
					case 4:
						
						indice = 0;
					    for (int i = 0; i < NombreProducto.length; i++) {
					    	indice+=1;
					        System.out.println(indice + "Nombre: " + NombreProducto[i]);
					        System.out.println("Precio: " + PrecioProducto[i]);
					        System.out.println("Cantidad: " + CantidadProducto[i]);
					        System.out.println("--------------------");					       
					    }
				
					    
					    System.out.println("Ingrese el valor del producto que desea Editar");
					    EditarProducto = scanner.nextInt();
					    scanner.nextLine();
				    	
				    	System.out.println("Ingrese la nueva Cantidad del Producto");
				    	CantidadNueva = scanner.nextInt();
				    	
				    	CantidadProducto[EditarProducto] = CantidadNueva;
						break;
						
					case 5:
						
						indice = 0;
					    for (int i = 0; i < NombreProducto.length; i++) {
					    	indice+=1;
					    	if(NombreProducto[i] != null) {
					    		System.out.println(indice + "Nombre: " + NombreProducto[i]);
					        	System.out.println("Precio: " + PrecioProducto[i]);
					        	System.out.println("Cantidad: " + CantidadProducto[i]);
					        	System.out.println("--------------------");					       
					    	}
					    }
						
						break;
						
					case 6:
						
						System.out.println("Ingrese el valor del producto que desee ver");
						indice = scanner.nextInt();
						
						if(indice < 7) {
							System.out.println("Nombre: " + NombreProducto[indice]);
					        System.out.println("Cantidad: " + CantidadProducto[indice]);
						}else {
							System.out.println("Opcion invalida");
						}
						
						break;
						
					case 7:
						int SumaInventario = 0;
						for(int i = 0; i < PrecioProducto.length; i++) {
							if(PrecioProducto[i] !=0 && CantidadProducto[i] !=0) {
								SumaInventario += PrecioProducto[i] * CantidadProducto[i];
							}
						}
						System.out.println("El valor total del inventario es: " + SumaInventario);
						
						break;
						
					 
				
				default:
					System.out.println("Error en la ejecucion");
				}
				
			}else if(opcion == 8){
				programa = false;
			}else {
				System.out.println("Opcion invalida");
			}
			
			
		} while (programa == true);

		scanner.close();
	}

}
