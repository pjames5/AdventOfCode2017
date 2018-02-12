import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object adventOfCodeDay7 extends App {

  override def main(args: Array[String]): Unit = {
    val test = "pbga (66)\nxhth (57)\nebii (61)\nhavc (66)\nktlj (57)\nfwft (72) -> ktlj, cntj, xhth\nqoyq (66)\npadx (45) -> pbga, havc, qoyq\ntknk (41) -> ugml, padx, fwft\njptl (61)\nugml (68) -> gyxo, ebii, jptl\ngyxo (61)\ncntj (57)"
    val input = "jlbcwrl (93)\nfzqsahw (256) -> lybovx, pdmhva\nrxivjo (206) -> mewof, hrncqs, qgfstpq\njhldwxy (26)\nbpzxjg (62)\nlahain (70)\nenbnfw (39)\nuzsytm (45)\ngmcsy (16)\nrsqyvy (99)\nlsbsfge (163) -> ldxgz, mksan\nhusmkc (29)\nootidjt (63)\npjhry (38)\nkvlbq (22)\nrdrad (6) -> gwyfm, fozyip, uotzz, fmkkz\noqbfkud (470) -> rnbqhk, mepez, mnksdxf, mjsck, bbfaxid, nglea\npgchejz (54) -> ifelr, rdkvtq\nzzjyw (91)\nyftjdo (12)\neqnvty (87)\nadbolgz (38)\nrcjqzp (65) -> mkyam, apdfe, avzljw, hxgidsw, fkgxak, wzsbsf, woczl\nksrsmjx (72)\nwfdlusw (49)\nrpoep (38)\njesiypo (78)\njjxvns (56)\nsyyfs (35)\notplae (91)\nepsjj (17)\nutgxfsh (959) -> mupbrv, borbd, jmieet\npxzdv (15)\nksybvgt (213)\ntywzhc (243)\nsbdja (16)\nctynr (63)\nvwbjuvx (99)\naidknm (97)\nqlgme (21) -> ehjnzn, cdbkci\nzetvslt (99)\nferzy (65)\ndssdiok (97)\ngexdb (6)\nbbzmsv (87)\nmepez (126) -> uqvyau, witovp\npubtsp (70) -> jlvwibm, uvvdw, okmqiy\ngjcxbx (44)\nmogwb (84)\nqwiekvk (65)\nkwbovke (74)\noffjbb (15) -> dvoja, jteju, wuybunc, qzpzi\ncwdmlj (86)\nojpok (88)\nlytcy (2662) -> bkmvwp, uyrwi\nantcinm (178) -> dmthn, ycacj, wkhggv\nkstvq (69)\nibysnvc (79)\nxulwh (71)\nzgqzrc (459) -> wlajxb, mfywm, jqmlxr\nuyrwi (11)\nqirjqsm (96)\nfnoteku (2482) -> mbezs, kcuygjx, bymkeq, opsqjx\nleeyi (88)\npcodkpi (95)\ntetdx (224) -> nshbwn, rpoep, fbqpk\najhctd (18)\nyhzuh (72)\ndmvjz (39)\nzdgwmi (24)\nvprkzya (37)\nipryqov (24)\npdxylvu (86) -> etscle, bqtawf\nehrqn (23) -> njabgq, fyzeso, jrgwnfh, fxasat\nekszr (148) -> gnmydtk, wchxl\nizkaqg (26)\nlovypfn (53)\nsztqzfl (98)\nckwopo (43) -> yurfpj, bgrxlxe, tohrp\nmuksdck (48) -> gwtcgyo, tfpuqgs\ntlfsn (21)\nhrvztx (57)\npsulm (1838) -> rhbouej, urhlfju, obfet\ndbufjl (95) -> faihy, oyamw\nucfhxsv (65)\nietfhkq (31)\npsvjtka (29)\nwzxei (51)\nswurfm (64)\noybwhs (18)\ndmdiy (1601) -> lazjlns, ygvol, rljjjo, whnjtp, jilomb\njteju (54)\nrdnpoms (177) -> eskdbe, fbhidp, xtkxwd\nrdhwx (62)\nhxgidsw (332) -> fukgfu, skkatyg\npcewixh (109) -> iekurr, xspxxb\ngsiypfp (1146) -> bhwca, qhcolun\nigpabio (53) -> mlqxueo, lhsncv\nvdjmhb (39)\npwdpe (42) -> leeyi, rhlpt, dtexqt, skpcerk\nciejakr (43) -> hcqnhm, anmeg, melsryt\nyehxck (2391) -> boygd, kayqqz, iajslqp\nsofve (139)\nasifeu (278) -> rtsajcq, dcouu\nmgqfa (75) -> cipgxee, jscjw\nkbppnh (99)\napwsmv (31)\ndzjyzd (39)\nuobgj (488) -> akidv, sofve, wblhx\nqngfv (8)\nkledju (95)\nbesihsl (86)\nzqnmsyb (73)\ncsqfv (14)\nubgrma (1059) -> ymhxg, yvxuom, aeyykn\nufyqf (77)\nllventw (308) -> lsbsfge, itxycu, nddymc\nzfhwfsw (53)\nkigdvl (31)\nfiufzkb (1194) -> ysigfem, bchfd, hgsmlsi\nvaubjz (233) -> erfnrn, gqzva, goxfpk\nyhpiqn (99)\nwzsbsf (222) -> mwztduj, hkpvwpa\nmjaol (281) -> dnazkh, jkamtqv\nmufnw (106) -> yxdld, obkhwze, nkssh\nmhapqqy (16)\nbrztp (27)\nebmjz (68) -> xfydt, eqnvty\nhkjwio (322) -> hdzxuz, zdgwmi, ipryqov\neszxg (18)\nqwzac (908) -> uiioczf, qjdpk, ylpuaf\nndsub (75)\nxcqwjrm (63)\nglsrg (74) -> maiimn, ufyqf\nmtcxdod (80)\nygmhxm (129) -> pljyyn, njdmj\nijcojo (1042) -> dxboqki, ikplh, pubtsp, omergh\nurhlfju (249) -> csqfv, rnddnj\nlgefkp (17)\nbmmmp (90)\nrjzrh (360) -> hbkujf, mzwbtsa, oywob, dmxhbe\nkhiom (117) -> hpaggeh, lqumiws\nzlgpmfs (143) -> ilxfa, nhpcp\nfozyip (293) -> kvlbq, pfqbht\nylpuaf (64) -> mdzkkjf, tfdbdq, kiauwpn\nxekimqs (65)\nbekxoxk (87)\nzybeuh (197) -> wonxzkm, jzuvrtp\npudyrbw (76)\nbcyarwn (65)\nsaowgr (367) -> gbnxgny, krmphks, yftjdo, zmpwz\ntgmle (73) -> prcjhey, thzwwh, cxhipq, tgvpi\nezxsv (90) -> qzqyveb, dfmlo\nrayez (17)\nujjpxe (56)\nefsrz (93)\nxaifomj (53)\nayury (23)\nzavef (69)\nqonfiro (190) -> cotvk, evqkdq\npuurcu (1689) -> awagc, ajhctd\nomergh (208)\npadxpdx (192) -> psvjtka, husmkc\ncxhipq (92)\njhgsgy (39)\nleyiz (74) -> fvfek, njrfnvt\nkdcvwyf (52)\nzyympz (887) -> pxteg, amnoi, amzwex\njbbmcxg (34)\nuvmqarq (751) -> muyodod, nclwgga, oeqvt\nduepwu (683) -> hbueku, zbcra, yxtjx\naatagmv (44)\nzsvuw (11)\nfynniwm (35)\nfjzpjk (88) -> uvsny, aatagmv\nrulhhsl (90)\nfcscdg (276) -> twvib, skjtvyz, oybwhs, rdmggka\nvwotlbl (61)\nijyoy (24)\njpenh (186) -> kdcvwyf, rjxvbkb\nqzpzi (54)\nnshbwn (38)\nfoyfb (50)\nkbyot (337) -> jhldwxy, izkaqg\nbhxdhmr (65)\nnetsm (53)\ntgffx (75) -> kstvq, cjmfqbo\nmsthql (7)\nhgscccv (62)\ndbnelj (212) -> jzcmf, sqiac, ijyoy, jjqguew\njxfqev (99)\nelmog (32)\nygvol (202) -> mszzq, tzzdbi\ngjrqs (159) -> iprkb, cgouh\nrabxkov (84)\nwenii (79) -> qsrpqe, zdhqhh, jpenh, hwrxn, vtvnn, mpgixa, fbjbwv\njkqvg (28)\nkzdugfh (90)\nmhkcp (17)\ntfhdccw (93)\nqzakfh (62)\nhrncqs (12)\ntzmndkd (221) -> lixsvp, ofyxhb\ncjmfqbo (69)\nikplh (98) -> bqifoq, pjedtl\nberje (87)\nikbqz (9)\navzljw (234) -> vdbihjp, zavef\nibiwh (26) -> ndsub, moihbcu\nvdvadz (38)\nyirnxk (158) -> lgefkp, rayez\nvbnlfuo (169) -> pppxrv, rdhwx\nlgxjr (238) -> mhkba, bsrkr\nynayo (71)\nuvvdw (46)\nudkyxw (48)\nzotwsb (170) -> wlufwnr, frksv\ntohdgsa (30)\nbqtawf (45)\nwrfxdc (25)\nvjxmbzm (69)\nopmmmd (32) -> pcodkpi, xhonf\nhkpvwpa (75)\nuflldd (39)\noelrlp (23)\nlptkbzc (151) -> unvje, bzsiwp\necdieu (23)\npxhwecw (57)\nryulu (61)\nuplweb (127) -> bpzxjg, utivde\nwblhx (97) -> xayglgm, pddllsa\ngrcox (91)\nxergqq (99)\ntgujvov (59) -> rhpco, ojpok, trbnpf\nsdnkg (1381) -> gyutarg, gcwcs, mfjeyx\noydxsh (67)\npxihdrd (50)\ncizehi (7)\nzhopeqm (80)\nfrksv (89)\nqvbfob (266) -> oejqkp, ocgkcxp\nldfsxw (17)\nwltpv (260) -> nlndxah, etyyw\npddteg (52) -> lwwyx, mhnlgyl, mvfhc, dzggd, opqoq, mufrkl, inghbu\nkybsigz (80)\nhgsmlsi (31) -> bqqwmry, lqavsk\ncbyvzkp (99)\ntjpatnk (44)\nsrneoo (11) -> dhlrq, ivwcuc, laxoeu\npiouhkc (95)\ntgfgem (33)\negrfvic (49)\njmieet (137) -> ckwooig, stkodp\ncldbz (15)\ngylsj (52)\necoqyk (35)\npnhibed (75) -> gmdsb, gijtd\nfksxl (5)\nrhpco (88)\neklahxm (51)\nftzht (8102) -> dmdiy, sfrbkzf, hlcnxe, zwsrt\ncykvxs (84)\nccckie (201) -> tgkusb, alztgi\nhbueku (10) -> ohcszyk, szutvca\ncztikzk (174) -> wxdpcvv, lpbayb\nlprmau (27) -> rqymw, dssdiok, dydwqz, eyale\nzorvynv (176) -> mqybmn, jaxidl\nlaxoeu (88)\nnvvxl (93)\nduophdw (72)\nqjwfsfk (11)\ntzzdbi (8)\nkwmam (184) -> wdybaj, cyielpd, hhifd, gexdb\nujktzrv (71)\ndvoja (54)\nopsqjx (71)\nhlrjgro (63)\noqjkafl (32) -> iwyjkz, auneqme, awccm\nvuyeiv (65)\nqhmyi (130) -> dvfuz, scruak\ntnayomw (62)\nezdhr (179)\nypfsjd (60) -> rdmrzdv, yhpiqn, cbyvzkp\nauneqme (86)\nkabixkr (73)\njntohm (41)\noyamw (65)\nutivde (62)\nqhcolun (76)\nqjcbye (535) -> fetkt, pcewixh, vaubjz, ojhlp, mnvgaqh, rcjiwg\nrfdpm (80) -> wcevmtt, tlayc\novvrx (84)\nzdhqhh (200) -> ylyef, onogiv, tohdgsa\nofidu (349) -> pjxqt, cytlm\nzqmlv (59)\nuzuawb (47)\nunvje (71)\nosbbt (1214) -> gqmscj, vyriv, bkkop\ntmyhhql (51)\nzxson (61)\nrhlllw (11)\nxtkxwd (17)\nlijeejc (57) -> mgkkyx, thzyz\ncrhho (1255) -> rfcfgg, chnfm, tuekps\njqkaucw (53)\nrerckg (63)\nkgevjdx (84)\nmuyodod (19) -> wolet, zzjyw\nzjzoo (65)\nevqkdq (91)\nmecyei (75)\nbvfcsls (227) -> knpwsi, ypfsjd, eilzvpr\nntabiof (365) -> rfohgya, yoqbgjb\ngqmscj (155) -> kjlmdi, scaec\nbkmvwp (11)\ntuekps (169)\nmksan (18)\napmdcz (16)\nplumb (89)\ngcmio (126) -> ujjpxe, jjxvns\nuqvyau (6)\nbdkoa (125) -> ctynr, tvnco\nxseshzl (76)\nmnpvutr (39)\nlghzki (27)\ncitugfl (14)\nvxgwku (16)\njwaskb (251)\nolkopyn (66) -> qjcbye, cstgeia, uojcup, ycctk, dkhuccj\njscjw (72)\nxatyg (71)\nxpfxwd (8)\njjjks (7331) -> qpefm, dlhiqh, gtervu, pcnroj, jijwa, bgbnlki\newvvi (53)\nycbgx (1531) -> tzmndkd, fpynzz, tywzhc\ncstgeia (613) -> ckwopo, sjiel, akwfu, ehvqyl, wtyfb, gcmio\nursjc (45)\nmabkbom (57)\nlafoho (250)\nxmvbzka (49)\noasspz (67)\nepumc (86) -> pcdjo, rerckg, dwknfpc\ncyielpd (6)\nlmqaxz (146) -> ghobhlm, qvvcx\nydqjoa (84)\nzfkfhfn (33) -> txapm, pygfz, ekszr, nbivp, wltpv, jsjaxjk\nsslltlv (45)\ntifqyde (2264) -> koxiwk, psulm, rcjqzp\nvonzkut (76) -> bdafpm, nvlxqp, gxsbt\nblagy (338)\ncluxnul (15)\nkdevmnr (77)\ncmxulaj (44) -> mnkqevh, mkbgt, nrcbc\ntygwtg (25)\nwpnqifq (11)\njilomb (68) -> uduan, mecyei\nkytnz (52)\ngynfwly (66) -> lynvd, dxhcxko, xaatl, leulsg, zworz, fkbrmim, jjjks\nmsfxkn (130) -> ietfhkq, kigdvl\nwewzb (164) -> yzptgez, ctytfj\nhdzxuz (24)\nghbfyqe (5)\nhbkujf (133) -> ukghke, aplbnbx\niwsjla (38)\ndnalt (35)\ngmdsb (75)\npcnroj (2553) -> oljci, losdis, sdnkg, zchulv, crhho\ndzrkq (94)\ncjcapa (292)\ndzohgiq (43)\nrhlpt (88)\ndkvzre (99) -> mieecfc, nvdouwn, dbnelj, onlwq, ayaouxu, xrhsy, bvrlaep\nzpntow (72)\nvohta (58)\njqmlxr (173) -> eiyxf, fydjnl\nlxhkgs (85)\nqoiuwmf (1008) -> vbnlfuo, wjyreb, sdbksb, lptkbzc, wopfs, khiom\nbtgrhku (24)\nnnhsuja (16)\njgwvp (84)\nvdpmvm (28)\niimfrx (59)\noyfma (21)\nsqypc (7)\ntxapm (272) -> isggu, yookz\nzhbiaq (45) -> rqzfef, kplegas, ayejq, xevhcxq\nbkcghv (35)\nyjakrqa (70)\nlmwrf (51)\nuwhjd (94)\nbpphw (49)\nvtvnn (114) -> uadnb, huunb\nblmfs (52)\nrtsajcq (6)\nlazjlns (190) -> xbyjur, edjwkkk\nrnddnj (14)\nvobeup (41)\nkifer (53)\njdzbqlz (15)\nwlufwnr (89)\nbqznix (75) -> stiln, duophdw, yhzuh\naovlz (45)\ndyrvvfn (340) -> prxseo, vxgwku\nukghke (28)\nlnczb (69) -> tzntd, cfnce\nqllluo (57)\nasbzj (89) -> yjxyb, hsifo, fhasacf, vwojb, gcbcyn\nsruyra (47)\nohplzu (58)\nfmkkz (319) -> owigu, ikbqz\nzimrsr (223) -> dxympe, fhpaqmd, ayury\ncdbkci (79)\ntchbf (93)\nwdybaj (6)\nbexvn (39)\nrcsfkrb (11)\nbgbnlki (2277) -> oqbfkud, qsqis, xhyqtqz, qorkez, qwzac, oewlch, gsiypfp\nzworz (41633) -> ootkqm, wfovakv, inldh\ndwknfpc (63)\nxjcprt (87)\nghobhlm (41)\nerfndpf (89) -> kwbovke, adxhax, cipwzoy\nsetrric (31)\nerggh (197) -> fksxl, ghbfyqe\npzksun (873) -> vyozfv, jxfqev, kbppnh\npddllsa (21)\nxeomb (44) -> vuyeiv, bwrpskq, qwiekvk, gxzkde\ndfmlo (80)\nguvuihw (39)\nkhqhd (42)\nfphgbca (59)\nfhasacf (269) -> fovilf, rjnzany\noyamsv (38)\nkjjyu (65)\npfqbht (22)\namzwex (218) -> vprkzya, wxixtqj, oktfn\nlwljcg (85)\nhpeaki (35)\nrcjiwg (35) -> odckjtb, jlfgvr, tdbne\nktazkb (57)\ntgvpi (92)\nsdhqlxw (1239) -> eklahxm, ejzeqxz, kabcmf\naonfaf (52)\nmlqxueo (67)\nakidv (21) -> cnvyxm, fphgbca\nbozlg (67)\newpbnsk (64)\nthzwwh (92)\ntuieolg (7624) -> ldnrw, cfuqhip, rjzrh\ntzrppo (51) -> tfhdccw, kbses, jlbcwrl, efsrz\nfbjbwv (290)\ndmthn (25)\nwitovp (6)\nugjzag (24)\nagliie (844) -> qjaywg, rridl, myaiu, antcinm, izhdt\nebgdslc (31)\nabmqz (31)\nhsfjd (21)\nootkqm (9535) -> uplweb, bdkoa, ehrqn, fpqudx, assuj, rjguqr, jwaskb\nldxgz (18)\natfhgyu (57)\nhbzju (71)\nrrywqx (69)\ndxqqhhd (188) -> pzewv, oelrlp\nixtrjm (92)\nnjeff (28)\ndxboqki (78) -> nstdz, ferzy\nmnwefbn (65)\nbugfhhx (357) -> abbnh, intfltq\nqorkez (1280) -> euqiok, ibvaekj\nanbcmt (17)\niprkb (26)\nvflyupn (34)\nruwzkz (362)\nxrxseqy (94)\nmszzq (8)\nthzyz (77)\nxyxtm (92)\nqeubhb (65)\nfmtyy (35)\nhpowmso (1854) -> jhysc, xeomb, nzwxd\nywvmghy (63)\nrridl (131) -> nqvflzq, vwotlbl\ndydwqz (97)\nmhnlgyl (1185) -> qntstgd, qzpgle, aozygag\nuycjl (292) -> xcqvne, ruxnrix\nohcszyk (32)\ngtervu (88) -> dkvzre, awufxne, osbbt, ycbgx, wdjzjlk\nxcqvne (35)\nmoihbcu (75)\nwpoga (57)\nrjxvbkb (52)\nbihsr (21) -> kyjkjy, hgscccv, yonjpz\nvmmjgy (742) -> vdkxk, yhyxv, cpfbmv\ngwnipjd (24)\nbrcpgz (57)\ndczcz (1862) -> wszghwt, navhthp, lsfggz\nwmaywuo (87)\nvrfkofp (49)\nnrcbij (64) -> pudyrbw, ghdime, xseshzl\nyxtjx (74)\ndnzdqz (179)\ngxsbt (58)\noqrmida (222) -> lixqwd, dnalt\nnddymc (93) -> ewvvi, netsm\niekurr (71)\ntcghqr (43) -> mnhojtk, ruwzkz, veksns, wrochvi, uycjl, umtfn, qgvsuqv\nikfihh (140) -> tygwtg, vlmhyer\nziypsz (84)\nehjnzn (79)\nexwxepj (175) -> jszpe, guvuihw, ykruy\ncapxp (68)\nnhpcp (34)\nqzpgle (77) -> gwnipjd, mrcoxnt\nedjwkkk (14)\nuteosk (65)\nofyxhb (11)\ntulxgem (213) -> mabkbom, btcjg, ktazkb, evcdf\ndkttrfw (219) -> ahqfoz, kytnz\nmttvnpg (9)\ntzntd (59)\neuqiok (9)\nwgypwo (290) -> btgrhku, aqkdlo\nchnfm (169)\nvlmhyer (25)\nurjwj (78)\nmiijab (49)\nfaihy (65)\nskkatyg (20)\nzfnoo (18)\ndcmxxd (35)\nevnlr (1175) -> erfndpf, hicuenj, zybeuh\nqzqyveb (80)\nwpdbejb (90)\ntrbnpf (88)\nyxxpgv (70)\nwyomko (184) -> tgfgem, clnkvox\ndxhcxko (45) -> ftzht, ypsme, rmtbjn, pjyld\nlixsvp (11)\nmofkvq (126) -> ejuiv, abmqz, xqobg\nzqtkn (79) -> ugjzag, dtzyg\nxhonf (95)\nkiauwpn (22)\nnmstp (44)\nhsifo (210) -> wfdlusw, myonh, qunldzi\nwhnjtp (146) -> zswyy, bmugsve\ntxkgx (60)\nicjur (76) -> lwaeqm, rhdudt\nfpynzz (24) -> kepkgvf, kabixkr, jbexk\nqunldzi (49)\nucxedq (84)\nwndpfac (55)\nhicuenj (122) -> ootidjt, hlrjgro, ywvmghy\nkkdaw (65)\ndmxhbe (141) -> myhrxc, jbbivz, behncf\nborbd (21) -> ujktzrv, hbzju, xulwh, xatyg\nadxhax (74)\nzwsrt (2544) -> xmvbzka, egrfvic, fovkc\nhhqlfj (81) -> xqgwwr, zmlmsuf\njiuuhl (78)\ndcouu (6)\nyetcvhx (71)\nrfcfgg (28) -> sruyra, bqmqbi, uzuawb\npygfz (92) -> kledju, upevl\netscle (45)\npzjbbdd (93)\nfjpgybt (21)\nmjsck (90) -> mkkpihe, fmqjogk\ncfuqhip (57) -> ixkicz, yqnihs, vifwkwa\njkamtqv (80)\nulvncs (172) -> bexvn, jzsmy\ncytlm (46)\naxikbt (9) -> tjffhqh, mogwb, cykvxs, ydqjoa\nlageym (228)\njmlznjh (50)\nwszghwt (160) -> brcpgz, wryfov\nyxdld (38)\nfukgfu (20)\nmjlnaz (72) -> zcgfj, jiuuhl\nbchfd (109) -> ccityq, nmvvgr\nogvod (1281) -> bihsr, erggh, dqgfb, xguhm\ngcxrx (91)\nttnnyy (92) -> lhsccbq, dpdjpal\nkxflpnl (16)\nehvqyl (192) -> zjgok, ecdieu\nlsfggz (94) -> itttb, wpdbejb\naacegb (8)\nwxdpcvv (8)\nviufoq (25) -> bekxoxk, wmaywuo\npqnte (70)\nrmtbjn (78) -> lytcy, aiunuvn, hfvhp, dczcz, kqaoir, ekihql, qkrydu\nimjutr (187) -> wgeig, wqbhby\nswpfak (21)\nvmvxwar (38)\nuxrrjqx (205)\nmddejh (441)\nfbhidp (17)\nvunam (90)\nrnbqhk (62) -> rdwkvr, oyamsv\nbezvr (55)\nkbses (93)\ndqgfb (43) -> hpuyku, rycmr\nuadnb (88)\ndnrfjv (55)\nwykkwa (67)\nkyjkjy (62)\nwrochvi (150) -> kifer, xaifomj, usodrg, jqkaucw\nkrmphks (12)\njbzaips (36)\nqjaywg (94) -> khpat, jcpavmj, bchlcqs\nkayqqz (77) -> kdqjj, sbdja, gmcsy\nzjgok (23)\nmrcoxnt (24)\nwopfs (159) -> oasspz, zgssy\nherqgqi (36)\nzcdzv (11)\nassuj (137) -> atfhgyu, pxhwecw\ncvgbj (48)\nlywkfsn (127)\ncpfbmv (204)\nscruak (30)\nlsteeu (162) -> tatubv, rprjk, tgblta, uxrrjqx, pweea, sgieno\nhhlxxzt (96) -> ixtrjm, tknmww, cnbekc\ngmwtl (49)\nsjiel (238)\npweea (51) -> eggmj, clpekkm\ncnnrj (78)\neilzvpr (213) -> ksrsmjx, zpntow\ncipwzoy (74)\napdfe (184) -> xrxseqy, leegl\nbkkop (347)\ncuhrgp (81) -> ohtply, vrfkofp\nkepkgvf (73)\nodkzxae (91)\nqmqrpcl (92)\nbgrxlxe (65)\nxqobg (31)\nawccm (86)\nslhitu (27)\ndihzy (79)\njfdscql (362) -> amrbhgv, rfdpm, ecxfenj, dxqqhhd\neqsxuaq (49)\nhlcnxe (1998) -> fcpde, zyniqni, offjbb\npdmhva (18)\ndtzyg (24)\nxpker (36)\ngqzva (6)\nthqkxpl (38)\navelbqj (31)\nmrigsjh (55)\nltbpi (17) -> vwcygm, herqgqi\nodckjtb (72)\ntdniuai (39)\ntohrp (65)\nwryfov (57)\nvhrtptr (139) -> bpqhqbg, pacsxn\nohrraic (94)\neyale (97)\nberaw (14)\nmfywm (79) -> erkarx, vscjrx\nknpwsi (261) -> cvgbj, uzjejte\nwjyreb (41) -> rabxkov, rxqfv, gcomv\nrdwkvr (38)\nmmerpi (5)\ncbgyk (43)\noxyof (44)\ntjhmz (51)\nzmqom (42) -> grazu, yxkldyi\nrxanas (210) -> ctfjb, ifbxvs\nlynvd (42593) -> tuieolg, pddteg, pixmx\nscaec (96)\nzbcra (38) -> rjeunph, edkigpl\nciogjt (375) -> tygnc, vhrtptr, ccckie\nuvsny (44)\nmpgixa (110) -> bmmmp, btxepbv\naqkdlo (24)\nyjxyb (77) -> tceog, pqnte, yxxpgv, aokpx\ntlayc (77)\nkjlmdi (96)\nrqhhyc (214) -> cizehi, sqypc\ntgkusb (32)\nxguhm (102) -> syyfs, hpeaki, fynniwm\nkoane (8) -> rawuoi, hkjwio, vpynuf, exxcrj, ljhtov, pwdpe, bdymucv\nphmtqf (175) -> aodnlv, jancm\nrjguqr (183) -> fgdqr, ccsrkny\nmnhojtk (218) -> kvdrnf, nkjgwn\nejuiv (31)\nrijipom (107) -> ijmfnt, ymduw, vdpmvm, njeff\nbbfaxid (138)\nyoqbgjb (25)\nbymzb (68) -> zneumoh, zhopeqm\nqntstgd (103) -> bbkfiz, zonni\nahqfoz (52)\ngfqtz (98)\nyvxuom (154) -> jbbmcxg, ppiiyuy\nzxkvs (12) -> bclicjl, yfruc, axikbt, nglji\nvwojb (97) -> qeubhb, kkdaw, ucfhxsv, rythrvz\nakpnwc (90)\nrawuoi (166) -> dzouqwl, vztyfp, dqgivj, cssov\neggmj (77)\nisggu (5)\njszpe (39)\nkmarvbs (90)\nbtxepbv (90)\nhjjfdj (11)\nsfrbkzf (45) -> tgmle, mddejh, tulxgem, ofidu, mjaol, dhqzt\nibvaekj (9)\nleegl (94)\nlfjtmkg (6095) -> lsteeu, zxkvs, sdhqlxw\nitttb (90)\nwlajxb (201) -> tgyavjg, eszxg\njlvwibm (46)\nhcqnhm (58)\niqygrur (44)\nbqifoq (55)\nfovkc (49)\naozygag (125)\nprcjhey (92)\nfetkt (203) -> nnhsuja, kxflpnl, xumsm\nqjzol (15)\nrufvv (162) -> qzcbtes, xekimqs\ndhlrq (88)\nmwztduj (75)\nydumax (61)\nboygd (13) -> wiayzvp, mdhhd, jkqvg, wouprxh\nuyrght (80) -> hvcii, lxhkgs\nnglji (311) -> cfaniht, anbcmt\npfutotv (44)\nzvwkjew (60)\nmiftchq (21)\nxaatl (56147) -> dgjls, qoiuwmf, koane, fnoteku, pavwo, hpowmso, yehxck\noejqkp (13)\noewlch (659) -> tgffx, eiwjrxx, ksybvgt\ndwpqell (35)\nmnksdxf (138)\nobfet (87) -> iolmgs, piouhkc\nkazqnjr (391) -> qngfv, aacegb\nkmogwi (1139) -> hkjtym, tgujvov, dkttrfw\nbehncf (16)\nofosgz (80)\nxejner (239) -> jmlznjh, foyfb, pxihdrd\nylyef (30)\nlqumiws (88)\njancm (58)\nrdkvtq (77)\nalztgi (32)\nmyhrxc (16)\nycctk (1381) -> qtgibw, lkorngt, mufnw\nwfovakv (48) -> lppvxfk, tznwmc, utgxfsh, zyympz, asbzj, ijcojo\nlhsccbq (42)\ntglnkgk (81) -> wrxiwgy, wrfxdc\nptkqcl (41)\ncipgxee (72)\necjdzpq (35)\nykpdiav (51)\nwdjzjlk (1631) -> iplyhhc, pgchejz, kwmam\nymhxg (48) -> vohta, ohplzu, edpjix\nvuetjdb (157) -> pbxjvnl, jdzbqlz, xhnmlcw, vipurf\nskpcerk (88)\nhfvhp (2018) -> wewzb, opmmmd, zmqom\nafrywlt (80)\namrbhgv (126) -> xpker, gkkrlg, jbzaips\nqsrpqe (236) -> brztp, kwwsxez\ncdpfk (92)\noksoj (51)\neiwjrxx (45) -> hbsmlf, dlabh, rcjxcou\npzewv (23)\nzonni (11)\nnkssh (38)\nnmvvgr (34)\niteizf (21)\ndvfuz (30)\nscmiv (54)\nqqishhq (14)\negsil (38)\niipqh (299)\nicqjyqd (16)\nzktnjab (87)\nnkskfx (94)\nleulsg (44696) -> tifqyde, olkopyn, lfjtmkg\neskdbe (17)\ndkhuccj (96) -> kbyot, zhbiaq, hhmavd, xejner, cqlwzk\nmkyam (372)\nwxixtqj (37)\nilxfa (34)\nwoczl (60) -> okseah, afeqhu, cnnrj, cmaxybh\nrjnzany (44)\nlppvxfk (1001) -> nrnmjo, phmtqf, bqznix\nuzjxd (196) -> zfnoo, wlaslo, tijkvua\nekihql (1184) -> ezxsv, vonzkut, dkyswuu, uyrght, uzjxd, yjomyth\nrljjjo (192) -> sobzsd, ykljt\nmfjeyx (49) -> tdniuai, vdjmhb\nqjdpk (28) -> wzxei, jopyit\nliamld (25)\nrjeunph (18)\nvscjrx (79)\ngwyfm (287) -> liamld, ucqdz\ngnmydtk (67)\nxspxxb (71)\nmwirmq (188) -> mnpvutr, dmvjz\nmyonh (49)\nmupbrv (218) -> phkwq, hrjgaqj, bwvemo\nkztkiqt (13) -> egsil, mjugqpu\nkhpat (53)\nwchlcja (190)\ntjffhqh (84)\ngeqwvx (129) -> acxlck, zqnmsyb, ojnziip\nufyavk (1838) -> vunam, kmarvbs, kzdugfh\nnvlxqp (58)\nizhdt (57) -> gfqtz, sztqzfl\nzfhxg (345) -> srneoo, ygmhxm, epumc\nwkhggv (25)\njjvxxtt (194) -> ldfsxw, mhkcp\nmhzgkxx (156) -> qzakfh, tnayomw\nbchlcqs (53)\nymduw (28)\ngrazu (90)\nfgdqr (34)\nswrkuc (199) -> gylsj, cyzzsc, blmfs, aonfaf\nzrpqdzn (62)\ndkyswuu (120) -> zjzoo, bhxdhmr\nmjugqpu (38)\ngijtd (75)\nhuhoda (191) -> bpphw, eqsxuaq, gmwtl\nvdkxk (90) -> hrvztx, fjhqmnv\nhuunb (88)\nstiln (72)\nexxcrj (316) -> dzjyzd, pkoww\nbdymucv (304) -> uzsytm, sslltlv\ndyscpqo (49)\ntremw (94)\nuotzz (61) -> xyxtm, cdpfk, qmqrpcl\nvlpop (64) -> hshyx, tchbf\nrdmggka (18)\nowigu (9)\nbpqhqbg (63)\naeyykn (66) -> lrkfnoy, ltdrusl\nkwwsxez (27)\njgtpw (84) -> cxnjv, zelucu, ygurya, mrsrl\noljci (892) -> asifeu, aoehbj, oqjkafl\nxqgwwr (23)\nctfjb (20)\ncxnjv (66)\nnrnmjo (105) -> pzjbbdd, nvvxl\nwydbqai (65) -> ryulu, ydumax\nghdime (76)\ncnvyxm (59)\nxffvy (59)\nqtgibw (52) -> ovvrx, ziypsz\nukkaxy (211)\nyurfpj (65)\nqvvcx (41)\nygurya (66)\nzchulv (72) -> cmxulaj, tetdx, huhoda, blagy, wgypwo\nrqzfef (86)\ndrgtn (84)\ngoxfpk (6)\nbcjecw (80)\nnjabgq (57)\ngcwcs (93) -> dokgk, epsjj\nfhzhqie (65)\nccsrkny (34)\nonlwq (59) -> ekxxsqa, jlfho, ekabfx\nldnrw (760) -> plumb, yvhilh, kztkiqt, ltbpi\nnnxfo (63) -> xffvy, zqmlv, krcoaft, iimfrx\nmrsrl (66)\nvztyfp (57)\npacsxn (63)\nmaiimn (77)\nusodrg (53)\nrzphpv (48)\npavwo (1890) -> mofkvq, fmxtg, rijipom, mgqfa\ngcomv (84)\npjxqt (46)\noywob (47) -> ynayo, ixxkvtz\nfovilf (44)\nypsme (11966) -> zfkfhfn, fiufzkb, ubgrma, puurcu\netyyw (11)\nccityq (34)\nhrjgaqj (29)\ndhqzt (305) -> capxp, pttij\ndpdjpal (42)\nfbqpk (38)\nqkrydu (1886) -> leyiz, mwirmq, hhwngc\nmufrkl (60) -> wyomko, lafoho, rxanas, vlpop, ulvncs, padxpdx\ncssov (57)\nwgeig (15)\nrythrvz (65)\njuptypm (14)\ndxympe (23)\nckwooig (84)\nzgimdwb (107) -> znucug, mrigsjh\nbbhyth (53) -> xcqwjrm, kgmwfq\nvyriv (50) -> vwbjuvx, xergqq, wlpfcsr\nqzcbtes (65)\nkgmwfq (63)\nlosdis (1165) -> vhmijln, lteyo, viufoq\niplyhhc (122) -> cbgyk, dzohgiq\nfpqudx (187) -> iuxgzr, icqjyqd, apmdcz, mhapqqy\njaxidl (86)\nxhyqtqz (77) -> swrkuc, ncfuru, kazqnjr\nrznnmp (70)\njvhxfl (39)\ngxzkde (65)\nuiwaf (97)\ncfnce (59)\nfkgxak (328) -> wpnqifq, xbucnh, qjwfsfk, rcsfkrb\nnrcbc (98)\naodnlv (58)\nyvhilh (89)\ncyzzsc (52)\npjedtl (55)\nbvrlaep (143) -> dnrfjv, wndpfac, bezvr\nclpekkm (77)\nwnyxznj (65)\nwonxzkm (57)\nvifwkwa (173) -> zvwkjew, txkgx, vvqpffs\nqroirmg (45)\nmdzkkjf (22)\npmfkdn (14)\nqgfstpq (12)\nmhydkla (7)\nyekjlfd (106) -> ecjdzpq, dcmxxd\ngxiwcqv (186) -> zfhwfsw, lovypfn\nifbxvs (20)\nlwwyx (41) -> vuetjdb, ciejakr, imjutr, zgimdwb, sdnlegj, gzixhdc, tlvkwlx\ntfdbdq (22)\ndzggd (663) -> iipqh, nnxfo, veggtf\nxwltxk (2001) -> yirnxk, baawtw, msfxkn\ntznwmc (1199) -> dnfvldg, dbufjl, pnhibed\nuiioczf (130)\nrcjxcou (56)\ntatubv (205)\nvvqpffs (60)\nbugwblt (14)\numtfn (80) -> hbylau, dzrkq, rugltaa\ncqlwzk (217) -> besihsl, cwdmlj\npxteg (56) -> odkzxae, gcxrx, cotpovw\nnbivp (106) -> ndnku, gjcxbx, iqygrur, oxyof\ntwvib (18)\nfyzeso (57)\nnlndxah (11)\nwolet (91)\npixmx (4482) -> hrgbkby, bvfcsls, tzvawqb, jfdscql, gqggcxb\nctytfj (29)\nlwaeqm (83)\ncnbekc (92)\nekzvjj (35)\nzgssy (67)\nhbylau (94)\nyonjpz (62)\nbtcjg (57)\ntdbne (72)\nedkigpl (18)\namnoi (141) -> noxvvva, dfeyr\ngwtcgyo (24)\nzrnlo (42)\nndnku (44)\netwwy (16)\nhsoxt (62)\nkdqjj (16)\ncgouh (26)\nmnvgaqh (128) -> jntohm, vobeup, ptkqcl\nocgkcxp (13)\nayaouxu (200) -> ksyewek, gpfrztg\nbaawtw (50) -> nnguamj, yetcvhx\nykljt (13)\nznucug (55)\nypqxs (31)\npmgrf (21)\nanmeg (58)\nfmxtg (84) -> ursjc, eqhxqxm, qroirmg\ndgjls (1926) -> lgxjr, hrphtyk, mhzgkxx\nprxseo (16)\nvhxlart (70)\nzyniqni (147) -> khqhd, zrnlo\ndtexqt (88)\nmqybmn (86)\npljyyn (73)\njzibybz (248) -> zrpqdzn, hsoxt\ndokgk (17)\nbclicjl (217) -> dxufd, jhcsmc\ntlvkwlx (133) -> fjpgybt, miftchq, oyfma, ytivjxk\nqsqis (1208) -> aovlz, mxusu\nmhkba (21)\nkvdrnf (72)\nfcpde (175) -> beraw, qqishhq, citugfl, pmfkdn\njcpavmj (53)\nbbkfiz (11)\nwqbhby (15)\nmfvkd (21)\nhhifd (6)\nibonrqn (50)\njzuvrtp (57)\nzelucu (66)\nzneumoh (80)\nljhtov (394)\nokmqiy (46)\ncmaxybh (78)\nphkwq (29)\nmvfhc (420) -> wchlcja, ikfihh, ybnvm, cztikzk, qhmyi, uebnns\njzsmy (39)\nedpjix (58)\nmyaiu (129) -> pqmrmke, iizbmoz, rhkbrsr, apwsmv\nmnkqevh (98)\nnoxvvva (94)\nncfuru (87) -> bcjecw, kybsigz, mtcxdod, ofosgz\npttij (68)\neutcl (77)\nmzwbtsa (119) -> eceocsy, ecoqyk\nwrxiwgy (25)\nfydjnl (32)\nbsixe (80)\noxcuf (80) -> crobb, xpfxwd\nyqnihs (56) -> wqoucl, rsqyvy, zetvslt\nmqhkd (100) -> pjhry, ljhxxd\nbwvemo (29)\nhbsmlf (56)\nsduuog (9)\nnnguamj (71)\nxrhsy (266) -> qbrrjg, juptypm, bugwblt\nrxqfv (84)\nbqqwmry (73)\ngyutarg (51) -> adbolgz, vdvadz\nvyozfv (99)\nnjrfnvt (96)\nruxnrix (35)\nsgieno (107) -> miijab, zryrfnw\nvpynuf (214) -> akpnwc, rulhhsl\nmkbgt (98)\niwyjkz (86)\nitxycu (45) -> eutcl, kdevmnr\nytspbx (184) -> nkskfx, ohrraic\nayejq (86)\nfhpaqmd (23)\njjqguew (24)\nmnfqc (789) -> zqtkn, hhqlfj, lywkfsn\naplbnbx (28)\nhshyx (93)\nozfzz (11)\nrhbouej (181) -> udkyxw, rzphpv\nwchxl (67)\ninghbu (1167) -> vcvypf, ljqmiu, tglnkgk\nfticuc (1360) -> vleydj, lnczb, igpabio, wydbqai\nivwcuc (88)\npeuppj (29) -> oqrmida, txxnutu, fzqsahw\nppiiyuy (34)\nmgkkyx (77)\nakwfu (50) -> tremw, uwhjd\ntceog (70)\nacxlck (73)\nwoves (32)\nveksns (308) -> slhitu, lghzki\nljhxxd (38)\ndqgivj (57)\nsdbksb (171) -> hbkjjtt, zxson\nerfnrn (6)\nnclwgga (201)\nmdhhd (28)\nrhzimzq (74) -> drgtn, raqjoxn\nrqymw (97)\nnkjgwn (72)\nvwcygm (36)\nacfyjc (85)\niajslqp (32) -> avelbqj, ebgdslc, vzqnfs\ndlhiqh (7301) -> rdrad, vmmjgy, uvmqarq\nkoxiwk (929) -> fcscdg, geqwvx, jgtpw, zorvynv, zotwsb\nyjomyth (97) -> oksoj, lmwrf, tjhmz\nhhwngc (138) -> ewpbnsk, swurfm\nikdsvc (1609) -> icjur, ebmjz, rxivjo, rhzimzq\nmewof (12)\nbmugsve (36)\nzcgfj (78)\ndyimc (54)\niuxgzr (16)\nfxasat (57)\nixkicz (353)\nfvfek (96)\nrycmr (82)\nxfydt (87)\nybnvm (50) -> dwpqell, fmtyy, bkcghv, ekzvjj\nabbnh (33)\npbxjvnl (15)\nlrkfnoy (78)\nlpbayb (8)\noeqvt (19) -> grcox, otplae\nbdafpm (58)\nupevl (95)\njijwa (3632) -> xwltxk, ikdsvc, tcghqr\ntgyavjg (18)\nbwrpskq (65)\nlhsncv (67)\nkqaoir (80) -> ytspbx, dyrvvfn, bkldmro, qonfiro, hhlxxzt, jzibybz, slrfd\ndlabh (56)\ndrfwgmu (249) -> zktnjab, cmfkxo\nqbrrjg (14)\ntijkvua (18)\nstkodp (84)\nzunhob (79)\ndnfvldg (85) -> yjakrqa, lahain\npjyld (10676) -> zfhxg, oenxsfm, ciogjt, ebmcu, mnfqc, zgqzrc, pzksun\ndxufd (64)\nzryrfnw (49)\nycacj (25)\nsmmgkir (31)\nbymkeq (71)\nbzsiwp (71)\nwqoucl (99)\nnjdmj (73)\ntzvawqb (1010) -> qirjqsm, muksdck, oxcuf\nljqmiu (31) -> ibonrqn, imezigo\npppxrv (62)\nxbyjur (14)\nhkjtym (247) -> iwsjla, thqkxpl\nucqdz (25)\nekxxsqa (83)\njbexk (73)\nmkkpihe (24)\nevcdf (57)\nsobzsd (13)\nrfohgya (25)\nahmitv (11)\nwtyfb (238)\ninldh (4965) -> ogvod, agliie, wenii\nmieecfc (138) -> lwljcg, acfyjc\nyrlks (44)\ngcbcyn (289) -> vflyupn, mbwenqu\nxevhcxq (86)\nxayglgm (21)\nhdlovco (5)\nawagc (18)\nzqnul (38)\nrhkbrsr (31)\nejzeqxz (51)\nonogiv (30)\nltdrusl (78)\nyzptgez (29)\nbkldmro (212) -> bsixe, afrywlt\nzksmijj (189) -> zsvuw, hjjfdj\npqmrmke (31)\ngzixhdc (124) -> ypqxs, setrric, smmgkir\nytivjxk (21)\nwiayzvp (28)\nhbkjjtt (61)\nrhdudt (83)\neqhxqxm (45)\ngpfrztg (54)\nslrfd (340) -> etwwy, qldijf\niolmgs (95)\nckhip (88) -> vhxlart, rznnmp\npcdjo (63)\nojnziip (73)\nnvdouwn (161) -> llibmc, jkfob, dyscpqo\ngbnxgny (12)\nvzqnfs (31)\nlixqwd (35)\ncrobb (8)\nvdbihjp (69)\nllibmc (49)\nlkorngt (132) -> tjpatnk, nmstp\necxfenj (78) -> urjwj, jesiypo\nekabfx (83)\nopqoq (648) -> mjlnaz, bymzb, lmqaxz, lageym\nyfruc (303) -> pmgrf, hsfjd\nfkbrmim (71889) -> peuppj, uobgj, llventw, duepwu\nnzwxd (103) -> wykkwa, oydxsh, bozlg\nkcuygjx (71)\nhvcii (85)\nfjhqmnv (57)\ntxxnutu (97) -> bcyarwn, uteosk, kjjyu\nhrgbkby (53) -> saowgr, lprmau, ntabiof\nxhnmlcw (15)\nclnkvox (33)\nbhwca (76)\nuojcup (985) -> ttnnyy, yekjlfd, pdxylvu, fjzpjk, mqhkd, ibiwh\nmxusu (45)\nixxkvtz (71)\ngqggcxb (29) -> tzrppo, bugfhhx, drfwgmu\nbsrkr (21)\nerkarx (79)\nkabcmf (51)\ntknmww (92)\nqgvsuqv (206) -> jhgsgy, enbnfw, uflldd, jvhxfl\ncfaniht (17)\njrgwnfh (57)\nrdmrzdv (99)\nkrcoaft (59)\nifelr (77)\nhpaggeh (88)\nwlaslo (18)\nwouprxh (28)\nhhmavd (359) -> pxzdv, qjzol\nbqmqbi (47)\naokpx (70)\nlteyo (157) -> mfvkd, swpfak\nhrphtyk (19) -> xjcprt, bbzmsv, berje\npkoww (39)\njsjaxjk (88) -> aidknm, uiwaf\nuebnns (127) -> iteizf, lzxrfk, tlfsn\nwcevmtt (77)\nyxkldyi (90)\nqpefm (823) -> kmogwi, ufyavk, evnlr, rmlddp, fticuc\ncmfkxo (87)\nqldijf (16)\nnstdz (65)\naoehbj (182) -> dyimc, scmiv\neceocsy (35)\nhwrxn (53) -> dihzy, ibysnvc, zunhob\nnglea (50) -> pfutotv, yrlks\nfmqjogk (24)\ntgblta (141) -> elmog, woves\njkfob (49)\nvcvypf (113) -> mttvnpg, sduuog\nwlpfcsr (99)\nlybovx (18)\nmbwenqu (34)\nobkhwze (38)\nvleydj (173) -> mhydkla, msthql\nuduan (75)\nykruy (39)\naiunuvn (1629) -> gjrqs, ukkaxy, lijeejc, zlgpmfs, zksmijj\nlqavsk (73)\nafeqhu (78)\nveggtf (104) -> wnyxznj, mnwefbn, fhzhqie\njbbivz (16)\nuzjejte (48)\njhysc (274) -> cldbz, cluxnul\nvhmijln (97) -> tmyhhql, ykpdiav\nnqvflzq (61)\ncotpovw (91)\nyookz (5)\nskjtvyz (18)\nszutvca (32)\nnavhthp (136) -> rrywqx, vjxmbzm\nokseah (78)\nebmcu (30) -> glsrg, ckhip, rqhhyc, jjvxxtt, rdnpoms\nwuybunc (54)\noktfn (37)\ntvnco (63)\ntfpuqgs (24)\nijmfnt (28)\nzswyy (36)\nsqiac (24)\nxbucnh (11)\nzmpwz (12)\ncotvk (91)\nohtply (49)\nysigfem (177)\njlfgvr (72)\nkplegas (86)\nmbezs (71)\nrprjk (205)\njlfho (83)\nmelsryt (58)\noenxsfm (275) -> cuhrgp, qlgme, bbhyth, dnzdqz, ezdhr\nsdnlegj (207) -> hdlovco, mmerpi\ndzouqwl (57)\nrugltaa (94)\nimezigo (50)\niizbmoz (31)\nvipurf (15)\nawufxne (2141) -> qllluo, wpoga\ngkkrlg (36)\ndfeyr (94)\nzmlmsuf (23)\nlzxrfk (21)\njhcsmc (64)\nksyewek (54)\njzcmf (24)\nxumsm (16)\neiyxf (32)\nintfltq (33)\nyhyxv (160) -> ahmitv, ozfzz, zcdzv, rhlllw\njopyit (51)\nrmlddp (64) -> rufvv, gxiwcqv, cjcapa, exwxepj, qvbfob, zimrsr, nrcbij\ndnazkh (80)\nraqjoxn (84)\ncgfykiv (38)\ntygnc (13) -> ucxedq, jgwvp, kgevjdx\nojhlp (137) -> zqnul, vmvxwar, cgfykiv\nhpuyku (82)"
    val nodes = new mutable.LinkedHashMap[String, Array[String]]()
    val testSplit = input.split("\n").map(x => x.split("->"))

    // Get the nodes
    testSplit.map(x => if (x.length > 1) nodes += x(0) -> x(1).split(","))

    val candidates = nodes.map(x => x._1.substring(0, x._1.indexOf(" ")).trim).toArray
    val leaves = nodes.foldLeft(new ArrayBuffer[String])((s, a) => s ++ a._2).map(x => x.trim)

    nodes.foreach(x => println("nodes: " + x.toString()))
    candidates.foreach(x => println("cand: " + x))
    leaves.foreach(x => println("leave: " + x))

    candidates.filter(x => {
//      println(x + ":" + leaves.contains(x))
//      println(leaves.toString())
      !leaves.contains(x)
    }).foreach(println)

  }
}
