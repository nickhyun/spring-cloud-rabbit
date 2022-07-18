word1=$(docker ps -a | grep rabbit| awk 'BEGIN { FS="[ ]" } ; { print $1 }')
docker stop rabbit  
docker rm $word1
