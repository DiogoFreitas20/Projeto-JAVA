import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Criação ArrayList//
    static ArrayList<Formando> osFormandos = new ArrayList<>();
    static ArrayList<Cursos> osCursos = new ArrayList<>();
    static ArrayList<Disciplinas> asDisciplinas = new ArrayList<>();
    static ArrayList<Inscrição> asInscrições = new ArrayList<>();
    static Continuar continuar = new Continuar();

    // Inserir Variáveis//
    static int idformando = 1;
    static int idcurso = 1;
    static int iddisciplinas = 1;
    static int idformandoinscrição = 1;

    public static void main(String[] args) {
        int idcurso = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Formando> lista = new ArrayList<>();
        ArrayList<Cursos> lista2 = new ArrayList<>();
        ArrayList<Disciplinas> lista3 = new ArrayList<>();
        Continuar continuar = new Continuar();
        Menus menus = new Menus();

        int escolha = 0;
        int escolhasec = 0;
        do {
            escolha = menus.showMenuPrincipal();
            switch (escolha) {
            // Escolha Formando//
            case 1:
                do {
                    escolhasec = menus.showMenuSecundário("Formando");
                    switch (escolhasec) {
                    case 1:
                        inserirFormando();
                        break;
                    case 2:
                        modificarFormando();
                        break;
                    case 3:
                        eliminarFormando();
                        break;
                    case 4:
                        for (Formando osFormandos : osFormandos) {
                            System.out.println(osFormandos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            // Escolha Curso//
            case 2:
                do {
                    escolhasec = menus.showMenuSecundário("Curso");
                    switch (escolhasec) {
                    case 1:
                        inserirCurso();
                        break;
                    case 2:
                        modificarCurso();
                        break;
                    case 3:
                        eliminarCurso();
                        break;
                    case 4:
                        for (Cursos osCursos : osCursos) {
                            System.out.println(osCursos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            // Escolha Disciplinas//
            case 3:
                do {
                    escolhasec = menus.showMenuSecundário("Disciplinas");
                    switch (escolhasec) {
                    case 1:
                        inserirDisciplina();
                        break;
                    case 2:
                        modificarDisciplina();
                        break;
                    case 3:
                        eliminarDisciplina();
                        break;
                    case 4:
                        for (Disciplinas asDisciplinas : asDisciplinas) {
                            System.out.println(asDisciplinas.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            // Escolha Inscrições//
            case 4:
                do {
                    escolhasec = menus.showMenuSecundário("Inscrições");
                    switch (escolhasec) {
                    case 1:
                        inserirInscrição();
                        break;
                    case 2:
                        modificarInscrição();
                        break;
                    case 3:
                        eliminarInscrição();
                        break;
                    case 4:
                        for (Inscrição asInscrições : asInscrições) {
                            System.out.println(asInscrições.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            }
        } while (escolha != 9);
    }

    // Formando//
    // Inserir//
    private static void inserirFormando() {
        Scanner sc = new Scanner(System.in);
        Formando formando = new Formando();
        sc = new Scanner(System.in);
        formando.setIdFormando(idformando++);
        System.out.println("Nome do formando: ");
        formando.setNomeFormando(sc.nextLine());
        System.out.println("Masculino (True/False): ");
        formando.setMasculino(sc.nextBoolean());
        System.out.println("Telefone: ");
        formando.setTelefones(sc.nextInt());
        osFormandos.add(formando);
    }

    // Modificar//
    private static void modificarFormando() {
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }

            System.out.println("ID do formando: ");
            int id = sc.nextInt();
            try {
                Formando formando = osFormandos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do formando: ");
                formando.setNomeFormando(sc.nextLine());
                if (!nome.isEmpty())
                    formando.setNomeFormando(sc.nextLine());

                System.out.println("Masculino (True/False): ");
                formando.setMasculino(sc.nextBoolean());

                System.out.println("Telefone: ");
                formando.setTelefones(sc.nextInt());

            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe.");
            }
        }
    }

    // Eliminar//
    private static void eliminarFormando() {
        Formando formando = new Formando();
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }
            System.out.println("Qual formando quer eliminar? (Digite o ID do mesmo)");
            int id = sc.nextInt();
            if (id > 0 && id <= osFormandos.size()) {
                if (osFormandos.size() == 0) {
                    System.out.println("Não há Formandos!");
                } else {
                    osFormandos.remove(id - 1);
                    idformando = 2;
                    int z = osFormandos.size();
                    for (int x = 2; x < z + 1; x++) {
                        formando = osFormandos.get(x - 1);
                        formando.setIdFormando(idformando++);
                    }
                    System.out.println("O aluno com o ID " + id + " foi eliminado.");
                    for (Formando c : osFormandos) {
                        System.out.println(c.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhum aluno com o ID " + id + ".");
            }
        }
    }

    // Curso//
    // Inserir//
    private static void inserirCurso() {
        Scanner sc = new Scanner(System.in);
        Cursos cursos = new Cursos();
        Formando formando = new Formando();
        Inscrição aInscrições = new Inscrição();
        sc = new Scanner(System.in);
        cursos.setIdCurso(idcurso++);
        System.out.println("Nome do Curso: ");
        cursos.setNome(sc.nextLine());
        System.out.println("Quantas horas: ");
        cursos.setHoras(sc.nextInt());
        System.out.println(asDisciplinas.toString());
        System.out.println("Quais as  disciplinas que quer adicionar? (Digite o ID da mesma)");
        int ID = sc.nextInt();
        aInscrições.setIdformandoinscrição(idformandoinscrição);
        osCursos.add(cursos);
    }

    // Modificar//
    private static void modificarCurso() {
        int idCurso = 1;
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }

            System.out.println("ID do Curso: ");
            int id = sc.nextInt();
            try {
                Cursos cursos = osCursos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do Curso: ");
                cursos.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    cursos.setNome(sc.nextLine());

                System.out.println("Quantas horas: ");
                cursos.setHoras(sc.nextInt());

                System.out.println("Disciplinas: ");
                cursos.setDisciplinas(sc.nextLine());

            } catch (Exception e) {
                System.out.println("O curso " + id + " não existe.");
            }
        }
    }

    // Eliminar//
    private static void eliminarCurso() {
        Cursos cursos = new Cursos();
        if (osCursos.size() == 0) {
            System.out.println("Não existe cursos.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }
            System.out.println("Qual curso quer eliminar? (Digite o ID do mesmo)");
            int id = sc.nextInt();
            if (id > 0 && id <= osCursos.size()) {
                if (osCursos.size() == 0) {
                    System.out.println("Não há Cursos!");
                } else {
                    osCursos.remove(id - 1);
                    idcurso = 2;
                    int z = osCursos.size();
                    for (int x = 2; x < z + 1; x++) {
                        cursos = osCursos.get(x - 1);
                        cursos.setIdCurso(idcurso++);
                    }

                    System.out.println("O curso com o ID " + id + " foi eliminado.");
                    for (Cursos c : osCursos) {
                        System.out.println(c.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhum curso com o ID " + id + ".");
            }
        }
    }

    // Disciplinas//
    // Inserir//
    private static void inserirDisciplina() {
        Scanner sc = new Scanner(System.in);
        Disciplinas disciplinas = new Disciplinas();
        sc = new Scanner(System.in);
        disciplinas.setIddisciplina(iddisciplinas++);
        System.out.println("Nome do disciplina: ");
        disciplinas.setNomedisciplina(sc.nextLine());
        System.out.println("Horas: ");
        disciplinas.setHorasdisciplina(sc.nextInt());
        asDisciplinas.add(disciplinas);
    }

    // Modificar//
    private static void modificarDisciplina() {
        Disciplinas disciplinas = new Disciplinas();
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há disciplinas!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Disciplinas oDisciplinas : asDisciplinas) {
                System.out.println(oDisciplinas.toString());
            }
            System.out.println("ID da disciplina: ");
            int id = sc.nextInt();
            try {
                Disciplinas oDisciplinas = asDisciplinas.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome da disciplina: ");
                oDisciplinas.setNomedisciplina(sc.nextLine());
                if (!nome.isEmpty())
                    oDisciplinas.setNomedisciplina(sc.nextLine());

                System.out.println("Horas: ");
                oDisciplinas.setHorasdisciplina(sc.nextInt());

            } catch (Exception e) {
                System.out.println("A disciplina " + id + " não existe.");
            }
        }
    }

    // Eliminar//
    private static void eliminarDisciplina() {
        Disciplinas disciplinas = new Disciplinas();
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há disciplinas.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Disciplinas aDisciplinas : asDisciplinas) {
                System.out.println(aDisciplinas.toString());
            }
            System.out.println("Qual a disciplina que quer eliminar? (Digite o ID da mesma)");
            int id = sc.nextInt();
            if (id > 0 && id <= asDisciplinas.size()) {
                if (asDisciplinas.size() == 0) {
                    System.out.println("Não há disciplinas!");
                } else {
                    asDisciplinas.remove(id - 1);
                    iddisciplinas = 2;
                    int z = asDisciplinas.size();
                    for (int x = 2; x < z + 1; x++) {
                        disciplinas = asDisciplinas.get(x - 1);
                        disciplinas.setIddisciplina(iddisciplinas++);
                    }

                    System.out.println("A disciplina com o ID " + id + " foi eliminada.");
                    for (Disciplinas d : asDisciplinas) {
                        System.out.println(d.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhuma disciplina com o ID " + id + ".");
            }
        }
    }

    // Inscrição//
    // Inserir//
    private static void inserirInscrição() {
        Scanner sc = new Scanner(System.in);
        Inscrição aInscrições = new Inscrição();
        for (Cursos osCursos : osCursos) {
            System.out.println(osCursos.toString());
        }
        System.out.println("Id do curso: ");
        int ID = sc.nextInt();
        aInscrições.setIdcurso(ID);
        for (Formando osFormandos : osFormandos) {
            System.out.println(osFormandos.toString());
        }
        System.out.println("Id do formando: ");
        int IDFormandoInscrição = sc.nextInt();
        aInscrições.setIdformando(IDFormandoInscrição);
        Cursos cursos = osCursos.get(ID - 1);
        aInscrições.setNome(cursos.getNome());
        Formando formando = osFormandos.get(IDFormandoInscrição - 1);
        aInscrições.setNomeformando(formando.getNomeFormando());
        asInscrições.add(aInscrições);
    }

    // Modificar//
    private static void modificarInscrição() {
        Inscrição inscrição = new Inscrição();
        if (asInscrições.size() == 0) {
            System.out.println("Não há inscrições!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Inscrição aInscrições : asInscrições) {
                System.out.println(asInscrições.toString());
            }
            System.out.println("ID da inscrição: ");
            int id = sc.nextInt();
            try {
                Inscrição aInscrições = asInscrições.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do formando:");
                aInscrições.setNomeformando(sc.nextLine());
                if (!nome.isEmpty())
                    aInscrições.setNomeformando(sc.nextLine());

            } catch (Exception e) {
                System.out.println("A inscrição " + id + " não existe.");
            }
        }
    }

    // Eliminar//
    private static void eliminarInscrição() {
        Inscrição aInscrições = new Inscrição();
        if (asInscrições.size() == 0) {
            System.out.println("Não existem inscrições.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Inscrição aIn : asInscrições) {
                System.out.println(aIn.toString());
            }
            System.out.println("Qual a inscrição que quer eliminar? (Digite o ID do respetivo formando)");
            int id = sc.nextInt();
            if (id > 0 && id <= asInscrições.size()) {
                if (asInscrições.size() == 0) {
                    System.out.println("Não há inscrições!");
                } else {
                    asInscrições.remove(id - 1);
                    idformandoinscrição = 2;
                    int z = asInscrições.size();
                    for (int x = 2; x < z + 1; x++) {
                        aInscrições = asInscrições.get(x - 1);
                        aInscrições.setIdformandoinscrição(idformandoinscrição++);
                    }
                    System.out.println("A inscrição com o ID " + id + " foi eliminado.");
                    for (Inscrição d : asInscrições) {
                        System.out.println(d.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhuma inscrição com o ID " + id + ".");
            }
        }
    }
}
