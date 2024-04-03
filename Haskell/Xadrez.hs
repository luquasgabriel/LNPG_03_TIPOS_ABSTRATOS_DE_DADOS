data Xadrez = Xadrez { tipo :: String, cor :: String, posicao :: (Int, Int) } deriving Show

criarXadrez :: String -> String -> (Int, Int) -> Xadrez
mover :: Xadrez -> (Int, Int) -> Xadrez
capturar :: Xadrez -> Xadrez -> Xadrez
ehMovimentoValido :: Xadrez -> (Int, Int) -> Bool
obterInformacoesPeca :: Xadrez -> [String]

data TabuleiroXadrez = TabuleiroXadrez { tabuleiro :: [[Xadrez]] } deriving Show

criarTabuleiroXadrez :: TabuleiroXadrez
moverPeca :: TabuleiroXadrez -> (Int, Int) -> (Int, Int) -> Bool
capturarPeca :: TabuleiroXadrez -> (Int, Int) -> (Int, Int) -> Bool
ehMovimentoValidoTabuleiro :: TabuleiroXadrez -> (Int, Int) -> (Int, Int) -> Bool