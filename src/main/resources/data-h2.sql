
  
INSERT INTO ROUTE (ROUTEID,ROUTENAME,SOURCE,DESTINATION,STATIONS) VALUES
  ('R1', 'Baiyappanahalli-Mysore Road','Baiyappanahalli','Mysore Road','Baiyyappanahalli; Swami Vivekananda Road; Indiranagar; Halasuru; Trinity; Mahatma Gandhi Road; Cubbon Park; Vidhana Soudha; Sir M. Visveshwaraya; Majestic; City Railway Station; Magadi Road; Hosahalli; Vijayanagar; Attiguppe; Deepanjali Nagar; Mysore Road' ),
  ('R2', 'Nagasandra-Yelachenahalli','Nagasandra','Yelachenahalli','Nagasandra;Dasarahalli;Jalahalli;Peenya Industry;Peenya;Goraguntepalya;Yeshwanthpur;Sandal Soap Factory;Mahalakshmi;Rajajinagar;Majestic;National College;Lalbagh;Yelachenahalli');
  

INSERT INTO METRO (METROID,ROUTEID,NOOFCOACHES,CROWDEDSTATUS,CURRENTSTATION,NEXTSTATION) VALUES
  ('M1','R1','3','Moderate','Indiranagar','MG Road'),
  ('M2','R2','3','Full','Goraguntepalya','Yeshwanthpur');  
  
INSERT INTO METROCOACH (COACHID,COACHNAME,METROID ,CAPACITY,FREESEATS) VALUES
  ('C1','C-1','M1',20,10),
  ('C2','C-2','M1',20,5),
  ('C3','C-3','M1',20,2),
  ('C4','C-1','M2',20,5),
  ('C5','C-2','M2',20,0),
  ('C6','C-3','M2',20,6);
  
