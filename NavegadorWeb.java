import java.util.Stack;

public class NavegadorWeb {
    private Stack<String> historicoVoltar = new Stack<>();
    private Stack<String> historicoAvancar = new Stack<>();
    private String paginaAtual = null;

    public void abrirPagina(String url) {
        if (paginaAtual != null) {
            historicoVoltar.push(paginaAtual);
        }
paginaAtual = url;
        historicoAvancar.clear();
        mostrarEstado();
    }

    public void voltarPagina() {
        if (!historicoVoltar.isEmpty()) {
            historicoAvancar.push(paginaAtual);
            paginaAtual = historicoVoltar.pop();
        } else {
            System.out.println("Não há páginas para voltar.");
        }
        mostrarEstado();
    }

    public void avancarPagina() {
        if (!historicoAvancar.isEmpty()) {
            historicoVoltar.push(paginaAtual);
            paginaAtual = historicoAvancar.pop();
        } else {
            System.out.println("Não há páginas para avançar.");
        }
        mostrarEstado();
    }

    private void mostrarEstado() {
        System.out.println("Página atual: " + paginaAtual);
        System.out.println("Voltar está " + (historicoVoltar.isEmpty() ? "desativado" : "ativado"));
        System.out.println("Avançar está " + (historicoAvancar.isEmpty() ? "desativado" : "ativado"));
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        NavegadorWeb nav = new NavegadorWeb();
        nav.abrirPagina("https://google.com");
        nav.abrirPagina("https://openai.com");
        nav.abrirPagina("https://mozilla.org");
        nav.voltarPagina();
        nav.voltarPagina();
        nav.avancarPagina();
    }
}
