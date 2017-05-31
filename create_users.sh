#!/bin/sh
# run this file in bin/ direcotry of business-central
./add-user.sh -a -u public -p 'password1!' -g rest-all;
./add-user.sh -a -u user1 -p 'password1!' -g user,user-role;
./add-user.sh -a -u employee -p 'password1!' -g user,employee-role;
echo "Users created!"

