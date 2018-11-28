import Control.Concurrent

main = do
    --cria uma MVar que inicialmente eh vazia
    m <- newEmptyMVar

    --coloca um valor numa MVar
    forkIO $ putMVar m 'x'

    --takeMVar retorna o conteudo da Mvar 
    r <- takeMVar m

    print r

main2 = do

    let msg1 = "ola, td bm?"
    let msg2 = "tudo sim, e vc?"

    forkIO $ print msg1
    forkIO $ print msg2
    print "fim"

main3 = do

    m <- newEmptyMVar

    forkIO $ putMVar m "hello my dark old friend"
    forkIO $ putMVar m "hello filho da pita"

    r <- takeMVar m
    print r

    r <- takeMVar m
    print r

    print "fim"