package com.tony.estruturadedatos.vetor;


/**Esta é uma classe para teste na Aula10 */
public class Contatos {
    private String nome;
    private Integer telefone;
    private String email;







    
    public Contatos() {
    }



    public Contatos(String nome, Integer telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getTelefone() {
        return telefone;
    }
    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Aula10Contatos [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
    }



  



    /**Metodo Equals, sua 1º comparação é a referencia de memoria */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) /**Referencia de Memoria é comparada aqui */
            return true;
        if (obj == null)
            return false; /**Compara se é nulo */
        if (getClass() != obj.getClass())
            return false;
        Contatos other = (Contatos) obj;
        /******************************OBS: Só retornará TRUE se TODOS os ATRIBUTOS forem IQUAIS *********************/
        if (nome == null) {
            if (other.nome != null) 
                return false;
        } else if (!nome.equals(other.nome)) /**compara cada atributo, e é isto que esta retornando */
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))  /**compara cada atributo, e é isto que esta retornando */
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))  /**compara cada atributo, e é isto que esta retornando */
            return false;
        return true;
    }


   

    
}
