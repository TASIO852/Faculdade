typedef struct livro {
    int isbn;
    char titulo[50];
    float valor;
    char autor[50];
    char editora[50];
    int ano_publicacao;
    struct livro *esq;
    struct livro *dir;
} Livro;

Livro* criar_arvore() {
    return NULL;
}
Livro* inserir(Livro* raiz, int isbn, char titulo[], float valor, char autor[], char editora[], int ano_publicacao) {
    Livro* novo_livro = (Livro*) malloc(sizeof(Livro));
    novo_livro->isbn = isbn;
    strcpy(novo_livro->titulo, titulo);
    novo_livro->valor = valor;
    strcpy(novo_livro->autor, autor);
    strcpy(novo_livro->editora, editora);
    novo_livro->ano_publicacao = ano_publicacao;
    novo_livro->esq = NULL;
    novo_livro->dir = NULL;
    
    if (raiz == NULL) {
        return novo_livro;
    } else {
        if (isbn < raiz->isbn) {
            raiz->esq = inserir(raiz->esq, isbn, titulo, valor, autor, editora, ano_publicacao);
        } else {
            raiz->dir = inserir(raiz->dir, isbn, titulo, valor, autor, editora, ano_publicacao);
        }
    }
    return raiz;
}
