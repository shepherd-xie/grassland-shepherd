work_path=$(cd `dirname $0`; pwd)
cd $work_path/grassland-shepherd-dependencies && ../mvnw clean install
cd $work_path/grassland-shepherd-domain && ../mvnw clean install
cd $work_path/grassland-shepherd-common && ../mvnw clean install
cd $work_path/grassland-shepherd-persistence && ../mvnw clean install
cd $work_path/grassland-shepherd-code-generater-maven-plugin && ../mvnw clean install
cd $work_path/grassland-shepherd-service && ../mvnw clean install
cd $work_path/grassland-shepherd-security && ../mvnw clean install
cd $work_path/grassland-shepherd-admin && ../mvnw clean install
