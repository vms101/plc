--concatenar duas listas
concat2 :: [a] -> [a] -> [a]
concat2 [] y = y
concat2 x [] = x
concat2 (x:xs) y = x:concat2 xs y

--inverter uma lista
inv :: [a] -> [a]
inv [] = []
inv (x:xs) = (inv xs)++[x]

--gerar uma lista
gerar :: Int -> [Int]
gerar n = n:gerar(n+1)

--somar elem de uma lita
soma' :: [Int] -> Int
soma' [] = 0
soma' (x:xs) = x + soma'(xs)

--funcao tail
my_tail :: [t] -> [t]
my_tail (x:xs) = xs

type Pessoa = String
type Carro = String
type Idade = Int
type Registro = (Pessoa, Carro, Idade)
type BD = [Registro]

f_bd :: BD
f_bd = [("Joao", "Camaro", 20), ("Maria", "Fusca", 30)]

getNome :: Registro -> Pessoa
getNome (n,_,_) = n

getCarros :: BD -> [String]
getCarros [] = []
getCarros ((_,c,_):xs) = c : getCarros xs