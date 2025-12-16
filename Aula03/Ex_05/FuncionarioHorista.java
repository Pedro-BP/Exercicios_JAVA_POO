    package Aula03_Ex_05;

    /**
     *
     * @author PEDROBORGESPOSPICHIL
     */
    public class FuncionarioHorista implements Pagavel {

        private String nome, funcao;
        private double salario;
        private int horas, dias;

        public FuncionarioHorista(String nome, String funcao, double salario, int horas, int dias) {
            this.nome = nome;
            this.funcao = funcao;
            this.salario = salario;
            this.horas = horas;
            this.dias = dias;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getFuncao() {
            return funcao;
        }

        public void setFuncao(String funcao) {
            this.funcao = funcao;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public int getHoras() {
            return horas;
        }

        public void setHoras(int horas) {
            this.horas = horas;
        }

        public int getDias() {
            return dias;
        }

        public void setDias(int dias) {
            this.dias = dias;
        }

        @Override
        public double calcularPagamento() {
            return salario *= (dias * horas);
        } 
    }
