data Biblioteca = Biblioteca { titulo :: String, autor :: String, anoPublicacao :: Int, copiasDisponiveis :: Int }

criarBiblioteca :: String -> String -> Int -> Int -> Biblioteca
obterTitulo :: Biblioteca -> String
obterAutor :: Biblioteca -> String
obterAnoPublicacao :: Biblioteca -> Int
obterCopiasDisponiveis :: Biblioteca -> Int
verificarDisponibilidadeCopia :: Biblioteca -> Bool
obterInformacoes :: Biblioteca -> IO ()
emprestarCopia :: Biblioteca -> IO ()
devolverCopia :: Biblioteca -> IO ()