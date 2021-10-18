function dailywage {
source ./attendence.sh

x=$?
if (( $x == 1 ))
then
	wage=$(($wageperhour*$fulldayhour))	
	echo "$wage:"
else
	exit
fi
}



wageperhour=20
fulldayhour=20
n=$?
