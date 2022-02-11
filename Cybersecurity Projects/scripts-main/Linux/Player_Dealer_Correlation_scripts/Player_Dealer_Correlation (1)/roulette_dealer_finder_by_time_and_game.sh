#!/bin/bash
game=''
if [ "$3" = "Roulette" ]
	then
	game='{print$1$2$5$6}'
elif [ "$3" = "BlackJack" ]
	then 
	game='{print$1$2$3$4}'
elif [ "$3" = "TexasHoldEm" ]
	then
	game='{print$1$2$7$8}'
fi
grep "$1" $2* | awk $game






