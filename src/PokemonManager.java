import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class PokemonManager {
    private ArrayList<Pokemon> bolsa = new ArrayList<>();
    private Pokemon[] pokedex = new Pokemon[150];
    private Integer contadorBolsa=0;
    private Integer contadorPokedex=0;

    public ArrayList<Pokemon> getBolsa() {
        return bolsa;
    }

    public void setBolsa(ArrayList<Pokemon> bolsa) {
        this.bolsa = bolsa;
    }

    public Pokemon[] getPokedex() {
        return pokedex;
    }

    public void setPokedex(Pokemon[] pokedex) {
        this.pokedex = pokedex;
    }

    public Integer getContadorBolsa() {
        return contadorBolsa;
    }

    public void setContadorBolsa(Integer contadorBolsa) {
        this.contadorBolsa = contadorBolsa;
    }

    public Integer getContadorPokedex() {
        return contadorPokedex;
    }

    public void setContadorPokedex(Integer contadorPokedex) {
        this.contadorPokedex = contadorPokedex;
    }
//-------------------------------------------------------------------------------------------
    public void capturarPokemon(Pokemon pk){
        System.out.println("Ingrese la informacion del Pokemon");

        System.out.print("Numero: ");
        Scanner scanner = new Scanner(System.in);
        pk.setNumero(Integer.parseInt(scanner.nextLine()));

        System.out.print("Nombre: ");
        Scanner scanner1 = new Scanner(System.in);
        pk.setNombre(scanner1.nextLine());

        System.out.println("Seleccione tipo:");
        System.out.println("1. Agua");
        System.out.println("2. Bicho");
        System.out.println("3. Dragon");
        System.out.println("4. Planta");
        System.out.println("5. Fuego");
        System.out.println("6. Otro");
        System.out.print("Opcion: ");
        Scanner scanner2 = new Scanner(System.in);
        String opcion = scanner2.nextLine();
        boolean flag = true;
        while(flag){
            switch (opcion){
                case"1":
                    pk.setTipo("agua");
                    flag = false;
                    break;
                case"2":
                    pk.setTipo("Bicho");
                    flag=false;
                    break;

                case"3":
                    pk.setTipo("Dragon");
                    flag=false;
                    break;
                case"4":
                    pk.setTipo("Planta");
                    flag=false;
                    break;
                case"5":
                    pk.setTipo("Fuego");
                    flag=false;
                    break;
                case"6":
                    System.out.print("Ingrese nuevo tipo: ");
                    Scanner scanner3 = new Scanner(System.in);
                    pk.setTipo(scanner3.nextLine());
                    flag=false;
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        }
        System.out.print("Peso: ");
        Scanner scanner3 = new Scanner(System.in);
        pk.setPeso(Double.parseDouble(scanner3.nextLine()));

        System.out.print("Altura: ");
        Scanner scanner4 = new Scanner(System.in);
        pk.setAltura(Double.parseDouble(scanner4.nextLine()));

        System.out.print("PS: ");
        Scanner scanner5 = new Scanner(System.in);
        pk.setPs(Integer.parseInt(scanner5.nextLine()));

        System.out.println("==Se registro nuevo Pokemon==");
        bolsa.add(pk);
        contadorBolsa++;
        registrarPokedex(pk);
    }

    public void registrarPokedex(Pokemon pk){
        for(int i = 0; i<pokedex.length;i++){
            if(pokedex[i]==null){
                pokedex[i] = pk;
                contadorPokedex++;
                break;
            }
            else if (pokedex[i]!=null && pokedex[i].getNumero()!=pk.getNumero()){
                if(pokedex[i].getPs() < pk.getPs()) {
                    pokedex[i] = pk;
                }
            }
        }
    }

    public void listarPokemon(){
        System.out.println("Seleccione lisa:");
        System.out.println("1. Bolsa");
        System.out.println("2. pokedex");
        System.out.print("Opcion: ");
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        switch (opcion){
            case"1":
                System.out.println("Pokemon en bolsa: "+ bolsa.size());
                if(bolsa.get(0)==null){
                    System.out.println("No hay pokemon");
                }
                else{
                    System.out.println("Pokemon en bolsa: "+ contadorBolsa);
                    for(Pokemon p:bolsa) {
                        p.imprimir();
                    }
                }
                break;
            case"2":
                if(pokedex[0]==null){
                    System.out.println("No hay pokemon");
                }
                else {
                    System.out.println("Pokemon en pokedex: " + contadorPokedex);
                    for (int i = 0; i < contadorPokedex; i++) {
                        System.out.println("=================================");
                        pokedex[i].imprimir();
                        System.out.println("=================================");
                    }
                }
                break;
        }

    }
    public void buscarPokemon(){
        System.out.println("Seleccione Lista: ");
        System.out.println("1. Bolsa");
        System.out.println("2. Pokedex");
        System.out.print("Opcion: ");
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        System.out.print("Ingrese el nombre del Pokemon a buscar: ");
        Scanner scanner1 = new Scanner(System.in);
        String nombreABuscar = scanner1.nextLine();

        switch (opcion){
            case"1":
                boolean estuvo = false;
                for(Pokemon p: bolsa){
                    if(p.getNombre().equalsIgnoreCase(nombreABuscar)){
                        p.imprimir();
                        estuvo = true;
                    }
                }
            case"2":
                for(int i=0; i < contadorPokedex; i++){

                }
        }
    }
    public void imprimirResumen(){

    }
}
