<template>
  <div id="h-footer">
    <footer class="w3-container w3-padding-32 w3-dark-grey">
      <div class="w3-row-padding">
        <div class="w3-third">
          <h3>제작자</h3>
          <p>안경진, 오세봉, 이성준, 이현우, 신중호</p>
          <p>천방지축 위기일발 일촉즉발 종횡무진 펼쳐지는 그들의 개발 이야기!! 기대해주세요!!!</p>
          <p>
            Powered by
            <a
              href="https://www.w3schools.com/w3css/default.asp"
              target="_blank"
            >TEAM 능구렁이</a>
          </p>
        </div>

        <div class="w3-third">
          <h3>BLOG POSTS</h3>
          <ul class="w3-ul w3-hoverable">
            <li class="w3-padding-16">
              <img
                src="data:image/jpeg;base64,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kltWObHz6eg/mYWxdmlT3jixGSg8upPny+c2Qe5mpCsatSdns3FwNkOA24SLMOIH8pN8xoCOsv2Bs3IO2vmACcsybczMHYmzu8bib2R9T/ElqLbKatxlyBOYiYUiIgIiICIiAiIgIiICIiAiIgIiICIiAiJpd5d4aeES58VRh4Evr5novnA7N4du08LT4m8Tn2EGrH9lHMyqNrbSqV6hqVG4idByUdFHITrx+Oes7VKjFmb5AdAOQHSbrdzdGribO96VLkfeb8oPLzOXrIrS7PwVSs3BTUsefQeZPISX4TYCYZAz+OqfZ8upA8v1ktwmzqOHp2VQiqLn4cyeZkY2ljeNi59FHQch/vnNSYaxqze6JkbMwRqtYZD3jMXB0S7ADMmTrZeBFJABrzPUyo78LQCKABawndETIREQEREBERAREQEREBERAREQEREBERARE1G8e3UwtPiPidrhE5sep6KOZgfG828CYVLmzVG9hOvmeij6yq6z1sVWv4q1SodAM/gOQHyE2+ztj4naFVqzGyk+Kq2mXJF520toOssXYmxKOGXhprmfac5s3qenkMpFR/drchadqmItUfUJqi+v4z9PXWTGczC2tjhRpluZyUdSf2GvwlRpt5doXPcrysX9dQPhr8pFalbjawuRoAOZnXtXFFbi92a5J8jqfUyS7m7BKgVqosx9lT7o8/6jKra7vbJ7peJvabXy8puoiRCIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAkUo7pmrXbEYxhVJY8NNb8AUE8IPUW5et75yVxA+UQAAAAACwAyAHpPqIgJBt4dqh3Y3+7QEL59T8Tp8JIN5cf3dPgU+J7j0Xmf2kb2PsU4lwXBFFDn/Ww5DyHP5QG6WwzWf7VWHh1pqedtD+UcuusngE4RAAABYDIAT6gIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgJ81agUFibAAknoBPqdGNwq1UNNrgG17GxyN/wBoEWw1FsZWZzdUBsT0A0UefP4yW0aQVQqgADIAT5w2HWmoRBwqNB/vOdsBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQERED//2Q=="
                class="w3-left w3-margin-right"
                style="width:50px"
              />
              <span class="w3-large">Lorem</span>
              <br />
              <span>Sed mattis nunc</span>
            </li>
            <li class="w3-padding-16">
              <img
                src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMTEhISExMSEBUVFRUVFRYVFhIXGhcYFhcYFhcfGRUYHSggGBolHRgTITEiKCkrLi4uGB80ODMvODQtLisBCgoKDQ0OFhAPFS0dFx0tLS0tKy0tKy0rLS0tLSsrLSstLS0tLS0rKy03Ny0tKy0rLTctLS0tKy0tLTErLSs3Lf/AABEIAOEA4QMBIgACEQEDEQH/xAAcAAEAAgIDAQAAAAAAAAAAAAAABgcEBQEDCAL/xAA8EAACAQIDBQUFBwQBBQEAAAABAgADEQQhMQUGEkFRBxMiYXEyQoGRoRQjUnKxwdFigpLwojM0U9LhFf/EABYBAQEBAAAAAAAAAAAAAAAAAAABAv/EABgRAQEBAQEAAAAAAAAAAAAAAAABETEC/9oADAMBAAIRAxEAPwC8YiICIiAiIgIiICIiAiIgIiICIiAiJE99N+8PgBwG9fEMPBQTNjfQta/CDy1J5AwJWTNJjt8MBRPDUxmHVua94pI9QDcSht7t6sViCRi6zXPs4OgeFF6d6cxfyPE35dJFcPsrEP4kp1GH9KMw/S0uD1dsrbuGxP8A29ejXtqEdWI9QDcTYzyKKtalVV/FQqrYqyA0yCBqALcJ9MjnPR/ZnvM2PwS1Klu9psaVW2QLKAQ1uV1ZT63gSuIiQIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIlfdq+/X2Kn3FBh9pqLe+vdIcuK34jmF+J5WIY3aV2j/Zi2EwhD4k5M+RFG/rkankcl1PSVZsmjiMTVangw9bEVP+vi2zOftCmzewnIufE3KwsJibp7u1toV+7S4UnirVTc5E53PO5vl7xv8AD0duxu3QwVIUqKBRzOXEx6seZmkRLc/stw2GAesBiaup4h4AfJT7R8z9JMcTTAFgAAOQymyqGQPtF30TA0+BCr4lx4EOYQHLjcdNbL7xHS5jRD+1/E0AlOjka/Gr5aolj7X5jw2HQE9LyHsIw7Lhq5PvVFP/AB/gr85TuCpVMVXLMWqMzXYnNnZj9STlPTG6Ox/suFp0suK3E9vxNr8sh6ASDcxESKREQEREBERAREQEREBERAREQEREBERAREQNZvLtlMHhquJqaU1uBzZjkqjzJIE8xO1faOMN71Ktd7nyv06AAW8gssXt528WqUcGp8KDvanmzXCfJeI/3Tv7Ft3Qqfa3HiqXVPJfePxyX+09ZYiwdyt26eCw60kAJ1drZs3M+nIDkJImNp8jISOb670pgcOarWd2utKne3G/meSjUnp5kQNb2i77rgKYVLVMRUH3aHRBpxv5dB7x8gSPPWMxVStUao7NUeoxZmbMknr9AOQyAynZtjadTEVXrVWLu5ux6nyHIDIAcgAJvdwd2nxddVAsNWb8KjU/sPMwJ/2P7q6YlxkmSX5voT/bp636S3Zj4DBpSppTQcKqAAPITIiqRE4dgASSABmSeQkHM4JlWb5drKoxw2zlGJqk8PekXQHog98+eS+sqTeTataux73FVca/vWJ7hTzCA5NbqqqOl9ZcHq5WB0IPpOZ5F2btKphuB6D1sNWBzZKg4XGZHhAHyPED0noLst33/wD0aLrVAXEUeHvLZB1b2XA5XIII5EdCJBOIiICIiAiIgIiICIiAiIgIiICIiB5Z38xhr7Rxb63rsg/Kjd2P+Ky+90MOKVCjT04KaA+trt9bzzljqv39RtfvXb18RMurYO+FCooYVFXIcSsQCp5gg/rpKif43GJTR6jsERFLux0VVFyT5AAzzTvvvK+OxL1TcIPDSQ+5TByFvxHVvM20Akw7UN+lrIMJhn41JBqupuGIN1RSPaF7EkZXCjPOVnToE3uD6dT0vy/WUd2y8C1Z1VQTcgADUk5ADzM9K7ibtLgsOosO8YAuR1tkB5DT5mVh2K7Bd8Q+JK/dIpVSdO8JHs+YXi9OIS9AJKOYgyG79doFDZ6lBatiCLrSB0voah91fLU8uoit9vBt/D4Oka2IqCmugGrOeirqx/02EoLfbtCxO0X7mmGpUSbLRQ3ap07wj2vyjL11ke2xtjFbQxAaozV6rnhRVGQv7qLoq/xck6zYbK2O7VRg8L97iG8Nesp8NMe8lNuVtGflmBNSI6Nh7AqYmsMLQ8THKvUHsqPeUMOQ0JGug53vXY25GFwtFVWkjtbN3UMSfjp6CbDcvdKjgKC00ALWHG9s2P7DoJvcSMo1VR9oG6NF6FWqiLTempe6gLcDM3AyPW/lI52I1yu1ABpUoVFYf4uPqsmvavtVaGDencceIvSUc+HLvW9Apt6usjPYTsxmxdTEEZJTIHq+Q+l5KL3iIkCIiAiIgIiICIiAiIgIiICdONrBKdRzkFRmP9oJndIv2mbS7jZuKe9iyd0vrUPB+hJ+EDzJUe5v1znKMWIUAMc7XtlYEkknQAAknkATOioZLNx9htWewF72Lm2gyZVF/QMfRemdR2bB3aeo2QLE6mxvb0GYH9Op963sS19g9nVEKnfXYAh2QeFWK+yGsL8IufCLC5N75WkO7WwkooMrfHWSERwfFKkqiygKOgAA+QnXjcWlJHqVGWmiKWZmNgoGZJM7iZWnbPvGlLBthVYGrWZVIFjworB2J8zZR18V5FaPeztjLK9PBU2pkkgVqlr8P4lp28LHO3FpzF8hVVKnVxNXhXirVahLEkkk82Z2Og5ljOMJgjUBdmWjSB8VV78OXJQM6j/0j42kk2BsqtjicJgabUqBt31V/bqjrVceynRB9ZrEdWzMExf7HgPvq9QcNfEroB7yUT7qdX1MvXcPcyls+iFWzVWA43t9B5Tv3M3PobPpBKY4nIHHUIzb+B5SRyWqTB2nilRGd2CIilnZjYKqi5JPQATJr1AoJJAyuSeQGtzKH7Sd9zjn+yYQ/cA3epoKpU3vflSU2I/EQDpa6COb17ZfaWMaoARTWyU1N8qdzwgjkzm7Hpp7svrs/wB3hg8IiEWqPZ6nkToPh/MgXZNucGZcVUU91TN6fEM6lTm5HQfwOsuOKEREgREQEREBERAREQEREBERASvO2LY2JxVLC0qIBpCozVSTYKQoFMnmVzqaA5lZYc0+8deyKnU3PoP/AL+kQUI3ZziBbx0TnfV8/wDjLV3D3dWiiiwJzJJ5sbMzW9dJyVkt2RQ4VAyBAANuts5pGeosLTmJoN5966GEpszOhdSBwXsc887A8uWpmVdm9W3EwtEsxKkq3CcsiBqb8hcdZ5r2ltha+KFWsr1KSkkoDZmAuQCerHU65nymXvnvdUxdRjchCxIW563F89ByHKRmi31lgs3c7s7rbQdcTiz3VH3EUWAXktNNFTz5+esvDZOyqOGpilQprSQcgNT1J5nzle7mdoeGajSSq6UKiKqMrkKCVAF0JyZTa+WY0MkWM7RMBTBLYmkSOSN3jf4pcy1EtmBtfa9HDU2q1qi0kXVmPyAGpJ5AZmVZt7toXNMHQao2gepkPUIpuw9Ssr/GYvEY+oKmKqVK5vZKSEAC/IFRwp0soLHK5vnJIqQb7b+Vtol8PhwaOFBs7MbFxy7wjRTypi5OV76DL7PtxDiSHYMmHU3dzk1UjkOg/TzM3+53ZuzBKmLHd01zSgvh88xqt+ZN2PMiWpQoqihVUKqiwAFgAOgltDD0FRVRFCqoAUDIADS07IiZCIiAiIgIiICIiAiIgIiICIiBwTIntLEd45PLQeg0/mZu9O21ogUxdnf3RbS1zc8hYZ+Uh524QbugAvmVa5HwIF4lk6Y21WwVmOigk+gF5kYbfKmvuO3mLD9TMaoQ9JrG4ZGsfIqZDcPU8Il9UiTbX3wrOCq2ore91vxWGgJv+kpferHu+IqF2ZjxG1yTYGWlh9iV648FNrfiOQ+ciu8fZ1jGxYRKTVOJFbiA8I5EFjkCLczzEkFckXhKZOgJ9B++kujYnYsTY4msF/opjiP+RsB8jJrs7s02fSt901U9ajMfoth9JUea6eDqnQEfG36TabO3WxNcgJTqVPyqzfW1p6fwuwcLT9jD0V9EW/ztebBVAyGUaqjt3uyLEPY1ytBeYJDN/guXzMtPdzdDC4MA004n/wDI9i3w5L8Jv4jQiIkCIiAiIgIiICIiAiIgIiICInBMDmaDa+3rOaFEhnHtvqKY/d+g5c+k0+8+9utLDnyaoP0T/wBvl1mFsfDmmpB1Ni3r0iDD24pWoKp4ijU2psw8RUsQQ3U6C/MgGaWhw8dVKy1OM0iaVOxHE5yUlgbWBINgTf6GaML5WuOYPOdmytkUy11pov5VUfpF8bdWVq8PhKxpphqIu5WzsdEU63PXP/byR7E3Ro0QGf75+raD0E3mFwyoLKLXzJ5k9TO+VHAFshlOYiQIiICCYiAiIgIiICIiAiIgIiICIiAiIgIidGMxaUkapUYIq6k/7mfKB2VaoUFmIVQLkk2AA6mV5vRvSa16VIlaWhOhf+F8ufPpMHebeR8S3CLpSByXmbc28/LQfWanA4c1XCjIaseg/mRWfsfB8R7xtB7Pmevw/X0m7rVRSpl2uQMza3MgDUga25z4Zgi2Cmy2FhbIaczoBn8OcwsIzYircewt1Urw3Iaw4SSGzNjcDgZcwQcjNyYje4Md5bgzB58rSVYLDBFAmLsrAhACRnz/AImzi1CIiZUiIgIiICIiAiIgIiICIiAiIgIiICIiAiJrtt7Yp4anx1DrkqjVj0H7nlA7dqbSp0KZqVGsBoObHoo5mVbt/b1TFPdvCg9hBovmerecxds7YqYmoalQ+SqNEHQfuecwLyLjszJsMydB1vJPs3CikltWObHz6eg/mYWxdmlT3jixGSg8upPny+c2Qe5mpCsatSdns3FwNkOA24SLMOIH8pN8xoCOsv2Bs3IO2vmACcsybczMHYmzu8bib2R9T/ElqLbKatxlyBOYiYUiIgIiICIiAiIgIiICIiAiIgIiICIiAiJpd5d4aeES58VRh4Evr5novnA7N4du08LT4m8Tn2EGrH9lHMyqNrbSqV6hqVG4idByUdFHITrx+Oes7VKjFmb5AdAOQHSbrdzdGribO96VLkfeb8oPLzOXrIrS7PwVSs3BTUsefQeZPISX4TYCYZAz+OqfZ8upA8v1ktwmzqOHp2VQiqLn4cyeZkY2ljeNi59FHQch/vnNSYaxqze6JkbMwRqtYZD3jMXB0S7ADMmTrZeBFJABrzPUyo78LQCKABawndETIREQEREBERAREQEREBERAREQEREBERARE1G8e3UwtPiPidrhE5sep6KOZgfG828CYVLmzVG9hOvmeij6yq6z1sVWv4q1SodAM/gOQHyE2+ztj4naFVqzGyk+Kq2mXJF520toOssXYmxKOGXhprmfac5s3qenkMpFR/drchadqmItUfUJqi+v4z9PXWTGczC2tjhRpluZyUdSf2GvwlRpt5doXPcrysX9dQPhr8pFalbjawuRoAOZnXtXFFbi92a5J8jqfUyS7m7BKgVqosx9lT7o8/6jKra7vbJ7peJvabXy8puoiRCIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAkUo7pmrXbEYxhVJY8NNb8AUE8IPUW5et75yVxA+UQAAAAACwAyAHpPqIgJBt4dqh3Y3+7QEL59T8Tp8JIN5cf3dPgU+J7j0Xmf2kb2PsU4lwXBFFDn/Ww5DyHP5QG6WwzWf7VWHh1pqedtD+UcuusngE4RAAABYDIAT6gIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgJ81agUFibAAknoBPqdGNwq1UNNrgG17GxyN/wBoEWw1FsZWZzdUBsT0A0UefP4yW0aQVQqgADIAT5w2HWmoRBwqNB/vOdsBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQERED//2Q=="
                class="w3-left w3-margin-right"
                style="width:50px"
              />
              <span class="w3-large">Ipsum</span>
              <br />
              <span>Praes tinci sed</span>
            </li>
          </ul>
        </div>

        <div class="w3-third">
          <h3>POPULAR TAGS</h3>
          <p>
            <span class="w3-tag w3-black w3-margin-bottom">Travel</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">New York</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">London</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">IKEA</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">NORWAY</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">DIY</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">Ideas</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">Baby</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">Family</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">News</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">Clothing</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">Shopping</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">Sports</span>
            <span class="w3-tag w3-grey w3-small w3-margin-bottom">Games</span>
          </p>
        </div>
      </div>
    </footer>
    <div class="w3-black w3-center w3-padding-24">
      Powered by
      <a
        href="https://www.w3schools.com/w3css/default.asp"
        title="W3.CSS"
        target="_blank"
        class="w3-hover-opacity"
      >TEAM 능구렁이</a>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: "Footer",
  components: {}
};
</script>

