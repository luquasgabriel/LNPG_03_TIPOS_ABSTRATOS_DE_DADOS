data Funcionario = Funcionario { nome :: String, id :: Int, cargo :: String, salario :: Double, departamento :: Departamento }

data Departamento = Departamento { nomeD :: String, idD :: Int, localizacao :: String, funcionarios :: [Funcionario] }

criarFuncionario :: String -> Int -> String -> Double -> Departamento -> Funcionario
atualizarInformacoesPessoais :: Funcionario -> String -> String -> Double -> Funcionario
transferirParaOutroDepartamento :: Funcionario -> Departamento -> Funcionario
obterDepartamentoAssociado :: Funcionario -> Departamento

criarDepartamento :: String -> Int -> String -> Departamento
adicionarFuncionario :: Departamento -> Funcionario -> Departamento
removerFuncionario :: Departamento -> Funcionario -> Departamento
obterFuncionariosAssociados :: Departamento -> [Funcionario]
