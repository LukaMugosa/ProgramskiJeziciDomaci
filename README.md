#Luka Mugosa, 16/2018, D-smjer

U prilogu se nalazi source kod - drugog zadatka, kao i dva screenshot-a dijagrama vezana za prvi zadatak.

1.    U prvom zadatku imamo jasno definisane 5 modela. Line je apstraktna klasa iz koje izvodimo, primjenom generalizacije klase Labour i Material.
      Klasa Invoice posjeduje vector koji referencira vise instanci klase apstraktne klase line, te stoga sam stavio strelicu i oznaku '*' na dijagramu.
      Takodje klasa Invoice referencira jednu instancu klase Client. Na drugoj slici je prikazan dijagram kolaboracije za main metod.

2. U drugom zadatku imamo 2 interfejsa i 4 modela. Interfejs NewAbsSupplier nasljedjuje metode interfejsa AbstractSupplier. Client i ConcreteSupplier implementiraju AbstractSuplier, a NewClient i NewConcSupplier implementiraju NewAbsSupplier. Interfejsima su metode ostavljene kao default, jer nije definisana implementacija u klasama NewClient i Client. AbstractSupplier je zatvoren modul jer on ne sadrzi nikakve dodatne implementacije i detalje, vec samo sluzi da se iz njega mogu izvesti neke implementacije koje imaju zajednicko ili slicno ponasanje.