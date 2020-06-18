rm -rf *
jar xf ../property-ear/target/property-ear-1.0-SNAPSHOT.ear
ls *ar | sed -e 's/\.\war//' |xargs mkdir  
for j in *ar 
do
  cd $(echo $j |sed -e 's/\.\war//')
  pwd
  jar xf ../$j
  cd -
done
ls *ar | xargs rm 

ls lib/

echo "MANIFEST..."
cat *web*/META-INF/MANIFEST.MF
