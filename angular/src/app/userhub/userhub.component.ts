/**
 * Created by samyy on 15-Aug-17.
 */

import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';


@Component({
    selector: 'app-userhub',
    templateUrl: './userhub.component.html',
    styleUrls: ['./userhub.component.scss']
})
export class UserHubComponent implements OnInit {

    constructor(private router: Router, private route: ActivatedRoute) { }

    ngOnInit() { }

    //loadUserInfo
}
