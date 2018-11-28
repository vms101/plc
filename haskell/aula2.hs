import Control.Concurrent

lista :: [Int] -> Int
lista [] = 0
lista (x:xs) = x + lista xs

main = do 
    --forkIO recebe um IO() e retorna um IO ThreadId
    --inicia uma nova thread
    forkIO $ do{
        putStrLn ("Obtendo a lista...");
        putStrLn ("Lista: "++(show(lista [1,2,3])));
        putStrLn ("Acabou de obter a lista1");
    }

    forkIO $ do{
        --threadDelay 3000000;
        putStrLn ("\nExecutando outra thread...");
        putStrLn ("valor: "++(show(lista [1,2,3])));
    }
    threadDelay 4000000
    putStrLn ("Fim!")