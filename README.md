# SoccerWorldCupJavaFX

VB szimuláció. 
A szimulációban házaspárok vesznek részt. A programban résztvevő minden egyes embernek van neve, és mindegyikükre jellemző a meccsnézés(), de teljesen eltérő módon, az viszont közös, hogy ennek során a megnézett meccs (vagyis a metódus paramétere) bekerül a megnézett meccsek listájába. Természetesen kétszer nem lehet megnézni ugyanazt a meccset.
A férjek meccsnézése során a meccsek közben elfogyasztott sörök száma növekszik, mégpedig ha jó a meccs, akkor egy, az összes férjre egyformán jellemző darabszámmal, ha nem jó, akkor pedig ugyancsak egy egyformán jellemző, de másik darabszámmal.
A feleségek esetében a metódus hatására a szabadidejük mennyisége növekszik a paraméterben adott meccs hosszával.
A házaspárokat egy férj és egy feleség alkotja , és meccsnézés()ük során mindkét félre érvényes a „meccsnézés”.
Egy meccs megadásához két csapat kell. Jellemző rá a meccshossz(), amely a minden meccsre egyforma értékű játékidő és a ráadás összege.
Végezetül egy csapat a nevével jellemezhető. Jelenleg csak ennyi érdekes belőle, de nem kizárt, hogy valamikor később még bővíteni lehet majd.
Olvassa be a házaspárok és a csapatok adatait a mellékelt adatfájlokból (a házaspárokat tartalmazó fájl szerkezete soronként: férj-név;feleség-név). A program indulásakor azonnal jelenjen meg a
házaspárok névsora, illetve külön-külön a férjek is és a feleségek is. Már induláskor is látható a sörök és szabadidők értéke (nulla), de az átlag, összeg és persze, az aktuális meccs nem. Ezek csak az első meccsnézés után válnak láthatókká.
A Meccs feliratú gomb hatása: A panel tetején megjelenik az aktuális
meccs – ez úgy áll elő, hogy véletlenszerűen
kiválasztja a meccshez tartozó két csapatot (figyeljen rá, hogy egy
csapat ne játsszon saját magával, de persze, több meccs is lehet ugyanazon
két csapat között). Állítsa be a meccs ráadás-idejét – ez egy 0 és adott határ
közötti véletlen érték, majd azt is, hogy jó-e a meccs – ennek esélye valahány
százalék.
Ezek után a házaspárok véletlenszerűen „eldöntik”, hogy nézik-e a meccset
– valahány százalék az esélye annak, hogy igen. Ennek hatására a férjekhez
és feleségekhez kiírt adatok is változnak, illetve az átlag és összeg értékek is. A férjek, feleségek a két külön listában is „egymás mellett” legyenek, lehetőleg a házaspár férj tagjának sörszáma szerinti csökkenő sorrendben. A férjek névsora alatt jelenjen meg az összes férjre vonatkoztatott
átlagosan fogyasztott sörszám, a feleségek névsora alatt pedig a feleségek összes szabadideje.
