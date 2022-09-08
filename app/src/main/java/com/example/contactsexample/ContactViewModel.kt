package com.example.contactsexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactViewModel:ViewModel(){
    var contact=MutableLiveData<Contact>()
    var list=createList()
    var currentPosition=MutableLiveData<Int>()

    private fun createList(): List<Contact> {
        return mutableListOf<Contact>(
            Contact("Aurelia","3-878-258-4573","brody.klein@heaney.com","Classmate"),
            Contact("Laila","7-604-326-0132","era.leffler@yahoo.com","Family"),
            Contact("Alma","6-601-328-4126","iaufderhar@johnston.info","Friend"),
            Contact("Hope","1-202-554-4218","nvandervort@hermann.net","Family Friend"),
            Contact("Sara","7-602-541-7824","theresia27@gmail.com","Colleague"),
            Contact("Lorraine","0-366-423-7030","everardo86@wunsch.com","Family"),
            Contact("Mandy","5-273-406-6423","donald33@hotmail.com","Friend"),
            Contact("Caitlyn","1-751-046-1407","peggie86@hotmail.com","College-mate"),
            Contact("Dakota","6-876-282-7888","florencio19@christiansen.com","Unknown"),
            Contact("Abdul","4-665-027-7052","fisher.maiya@hotmail.com","College-mate"),
            Contact("Nathan","4-140-107-6267","clarkin@goldner.com","Classmate"),
            Contact("William","4-562-855-2004","joel.mclaughlin@schuppe.info","Family"),
            Contact("Aileen","4-786-357-7302","ofunk@murray.info","Friend"),
            Contact("Winnie","8-681-878-0710","powlowski.kory@hotmail.com","Colleague"),
            Contact("Carol","5-203-101-1487","odaniel@hotmail.com","College-mate"),
            Contact("Lucas","2-710-434-1672","ward.mathew@yahoo.com","Classmate"),
            Contact("Charlotte","6-886-578-6856","jrath@koepp.com","Family"),
            Contact("Maggie","2-543-716-4408","arnold93@yahoo.com","Friend"),
            Contact("Rick","5-248-375-0322","vernon59@yahoo.com","Family Friend"),
            Contact("Dalia","8-563-230-5176","janet86@mcdermott.com","Classmate"),
            Contact("Leilani","1-141-708-0252","lschaden@hotmail.com","Family"),
            Contact("Sebastian","8-388-225-4107","krystal79@leannon.com","Friend"),
            Contact("Isabella","4-604-466-2634","zander46@bosco.com","Family Friend"),
            Contact("Alice","2-726-844-8455","howard99@gmail.com","Colleague"),
            Contact("Emely","3-558-060-8428","nolan.fritz@wilkinson.biz","College-mate"),
            Contact("Alexia","4-282-036-7061","reta72@hotmail.com","Unknown"),
            Contact("Cherish","3-580-031-8206","rocky10@gmail.com","Classmate"),
            Contact("Joyce","6-146-527-6020","cielo83@lowe.com","Family"),
            Contact("Caitlyn","1-553-833-8330","","Friend"),
            Contact("Mackenzie","5-521-124-6643","daugherty.polly@hauck.com","Family Friend"),
            Contact("Abbey","7-632-377-3153","nestor.kub@harvey.com","Colleague"),
            Contact("Ethan","2-333-732-2614","annetta.batz@yahoo.com","Colleague"),
            Contact("Gil","7-684-021-6564","delores.swaniawski@friesen.com","Classmate"),
            Contact("Tom","1-573-082-8803","zbartell@murray.com","Family"),
            Contact("Sofia","8-071-474-3013","walker.justine@yahoo.com","Friend"),
            Contact("Eden","0-636-672-7254","vhilpert@upton.com","Family Friend"),
            Contact("Ethan","5-507-551-2208","veum.christine@schumm.com","Classmate"),
            Contact("Macy","6-551-346-4744","derek10@braun.com","Family"),
            Contact("Nina","4-886-337-2272","heller.ramon@yahoo.com","Classmate"),
            Contact("Owen","7-426-642-4162","bernadette64@yahoo.com","Family"),
            Contact("Sebastian","0-667-144-1023","rodrick60@barton.com","Classmate"),
            Contact("Catherine","4-573-628-6511","ethel.champlin@rau.com","Friend"),
            Contact("Lily","8-073-156-1315","damaris.mcclure@sanford.org","Friend"),
            Contact("Ron","6-646-271-0066","tmcglynn@gmail.com","Family Friend"),
            Contact("Kieth","8-043-446-3443","zschiller@bruen.info","Colleague"),
            Contact("Gabriel","7-841-420-0422","bergnaum.hans@gmail.com","Family"),
            Contact("Tom","3-868-316-2556","ftorphy@gmail.com","Family"),
            Contact("Goldie","0-522-111-1815","jreichel@yahoo.com","Friend"),
            Contact("Maxwell","3-684-614-4076","brooke22@yahoo.com","Family"),
            Contact("Marilyn","1-871-361-7137","bode.josefina@macejkovic.com","Friend"),
            Contact("Chester","1-663-600-1602","kylie83@crona.com","Family Friend"),
            Contact("Violet","4-400-755-8813","joan.dooley@ondricka.com","Colleague"),
            Contact("Hayden","7-632-312-5067","gertrude.gibson@hotmail.com","Family Friend"),
            Contact("Chester","5-403-840-4256","celine.bahringer@roberts.com","Family"),
            Contact("Ryan","1-512-535-7227","lambert.pfannerstill@gmail.com","Friend"),
            Contact("Mason","1-824-722-5818","ytrantow@gmail.com","Family"),
            Contact("Harmony","8-734-150-6853","beatty.chadrick@gmail.com","Friend"),
            Contact("Livia","4-022-117-2211","waters.eleanora@hotmail.com","Colleague"),
            Contact("Enoch","4-782-316-2374","tblock@hettinger.com","Classmate"),
            Contact("Daphne","1-482-276-6722","ayla49@yahoo.com","Family Friend"),
            Contact("Wendy","6-585-516-3127","lauer@heidenreich.com","Colleague"),
            Contact("Maxwell","2-070-274-0033","jayne14@hotmail.com","Classmate"),
            Contact("Denis","3-005-554-3302","rkiehn@hoeger.org","Friend"),
            Contact("Cara","2-070-105-0558","doyle76@crist.com","Family Friend"),
            Contact("Anthony","4-186-154-7752","darian.cremin@yahoo.com","Unknown"),
            Contact("Benjamin","1-167-841-1542","yazmin.doyle@borer.net","Family"),
            Contact("Jocelyn","2-467-418-5134","xmante@wyman.com","Friend"),
            Contact("Holly","6-334-344-5733","brakus.tanya@hotmail.com","College-mate"),
            Contact("Ilona","4-578-566-8200","bernier.juvenal@gmail.com","Colleague"),
            Contact("Hank","1-580-622-1676","rowe.rosanna@hagenes.com","Family Friend"),
            Contact("Carissa","6-354-031-7527","ifunk@schamberger.com","Classmate"),
            Contact("Dakota","6-873-224-1285","mkreiger@padberg.com","Family"),
            Contact("Ron","0-446-607-4823","name.green@gmail.com","Family"),
            Contact("Aleksandra","5-734-217-0522","nicolas.oran@kreiger.com","Friend"),
            Contact("Bob","4-584-405-3362","brown.darren@gmail.com","Family Friend"),
            Contact("Ruth","6-416-544-2657","leola18@kessler.org","Colleague"),
            Contact("Ivy","4-054-113-1515","ryan.gonzalo@grant.biz","College-mate"),
            Contact("Harvey","3-252-105-6327","renner.evangeline@gmail.com","Unknown"),
            Contact("Johnathan","7-716-006-7456","marlen.lindgren@becker.net","Unknown"),
            Contact("George","0-531-352-7026","gortiz@hotmail.com","Classmate"),
            Contact("Lucas","6-180-675-3348","okeefe.jenifer@hoppe.com","Family"),
            Contact("Bart","4-707-573-5003","graham.iliana@yahoo.com","Friend"),
            Contact("Stella","1-586-542-6347","schowalter.camila@hackett.com","Family Friend"),
            Contact("Jane","7-216-032-2037","friesen.carleton@hessel.com","Colleague"),
            Contact("Naomi","7-176-158-6504","hprosacco@wehner.com","Colleague"),
            Contact("Carter","4-531-213-7004","robel.brooklyn@kutch.org","Classmate"),
            Contact("Cassandra","8-860-114-0517","loyal.kirlin@homenick.com","Family"),
            Contact("Nicholas","1-402-150-1868","alberta28@weimann.com","Friend"),
            Contact("Carl","5-777-023-1680","dorothea92@hotmail.com","Family Friend"),
            Contact("Jolene","3-287-343-8886","gaylord.lyric@gmail.com","Classmate"),
            Contact("Carter","8-270-160-0451","grutherford@beahan.net","Family"),
            Contact("Savannah","5-204-406-2161","ozemlak@hotmail.com","Friend"),
            Contact("Sasha","3-416-800-1303","lauren79@christiansen.com","Family Friend"),
            Contact("Shelby","3-488-568-3818","drake40@hotmail.com","Classmate"),
            Contact("Tania","6-066-458-8347","verda.ritchie@gmail.com","Family"),
            Contact("Madison","1-681-268-6522","eladio.bechtelar@hotmail.com","Friend"),
            Contact("Doris","4-084-322-4383","marie18@schimmel.info","Family Friend"),
            Contact("Clint","6-570-800-7513","cassidy.schaden@schulist.com","Unknown"),
            Contact("Irene","1-450-734-3180","jeremie.lowe@gmail.com","Colleague"),
            Contact("Dalia","5-526-744-6828","alayna92@yahoo.com","Family"),
            Contact("Rachael","2-128-756-4067","bonnie.ward@gmail.com","Classmate")
        )
    }
}