select * from homework;

select * from lesson
    left join homework h on h.id = lesson.homework_id;


select * from lesson
    join homework h on h.id = lesson.homework_id order by updatedAt;

select * from schedule
    left join lesson l on l.id =schedule.id;

select * from schedule
    left join lesson on lesson.id = schedule.id
    group by schedule.id, schedule.name;

select  COUNT(lesson.id) from schedule
    left join lesson on lesson.id = schedule.id
    GROUP BY schedule.id, schedule.name;
